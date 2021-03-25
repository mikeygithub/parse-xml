package com.tongdun.parsexml.sax;

import com.tongdun.parsexml.config.Constant;
import com.tongdun.parsexml.entity.person.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class ParsePersonHandler extends DefaultHandler {
    //personList
    List<Person> personList = new LinkedList<>();
    Person person = new Person();
    //初步统计记录
    Integer count = 0;
    //当前标签
    String currTag;
    boolean start = false;
    //person下的子标签
    Name name;
    NameValue nameValue;
    List<NameValue> nameValueList = new LinkedList<>();
    //列表
    Description description;
    List<Description> descriptionList = new LinkedList<>();
    //列表
    Role role;
    OccTitle occTitle;
    List<OccTitle> occTitleList = new LinkedList<>();
    //DateDetails
    Date date;
    DateValue dateValue;
    List<DateValue> dateValues = new LinkedList<>();
    //BirthPlace
    Place place;
    List<Place> places = new LinkedList<>();
    //SanctionsReferences
    Reference reference;
    List<Reference> references = new LinkedList<>();
    //address
    Address address;
    List<Address> addresses = new LinkedList<>();
    //countryDetails
    Country country;
    List<Country> countryList = new LinkedList<>();
    //IDNumberTypes
    ID id;
    List<ID> idList = new LinkedList<>();
    //SourceDetails
    Source source;
    List<Source> sourceList = new LinkedList<>();
    //Images
    Image image;
    List<Image> imageList = new LinkedList<>();

    // 开始解析文档，即开始解析XML根元素时调用该方法
    @Override
    public void startDocument() throws SAXException {
        System.out.println("--开始解析XML文档--");
    }
    // 开始解析每个元素时都会调用该方法
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        //如果当前标签为Person
        if ("Person".equals(qName))this.start = true;
        if (this.start) {
            currTag = qName;
            if ("Person".equals(qName)) {
                person = new Person();
                //设置person的属性
                person.id = attributes.getValue("id");
                person.action = attributes.getValue("action");
                person.date = attributes.getValue("date");
            }
            if ("Name".equals(qName)) {
                name = new Name();
                name.nametype = attributes.getValue("NameType");
                name.personId = person.id;
                //直接插入返回期自增id
                name.id = Name.insertRetrunKey(name);
            }
            if ("NameValue".equals(qName)) {
                nameValue = new NameValue();
                nameValue.nameId = String.valueOf(name.id);
            }
            if ("Description".equals(qName)) {
                description = new Description();
                description.personId = person.id;
                description.description1 = attributes.getValue("Description1");
                description.description2 = attributes.getValue("Description2");
                description.description3 = attributes.getValue("Description3");
            }
            /////////////////////////////////////////////Roles列表///////////////////////////////////////////////
            if ("Roles".equals(qName)) {
                role = new Role();
                role.personId = person.id;
                role.roletype = attributes.getValue("RoleType");
                //直接插入返回期自增id
                role.id = Role.insertRetrunKey(this.role);
            }
            if ("OccTitle".equals(qName)) {
                occTitle = new OccTitle();
                occTitle.rolesId = role.id;
                occTitle.occcat = attributes.getValue("OccCat");
                occTitle.toyear = attributes.getValue("ToYear");
                occTitle.tomonth = attributes.getValue("ToMonth");
                occTitle.today = attributes.getValue("ToDay");
                occTitle.sinceyear = attributes.getValue("SinceYear");
                occTitle.sincemonth = attributes.getValue("SinceMonth");
                occTitle.sinceday = attributes.getValue("SinceDay");
            }
            ////////////////////DateDetails
            if ("Date".equals(qName)) {
                date = new Date();
                date.personId = person.id;
                date.datetype = attributes.getValue("DateType");
                //直接插入返回期自增id
                date.id = Date.insertRetrunKey(date);
            }
            if ("DateValue".equals(qName)) {
                dateValue = new DateValue();
                dateValue.dateId = date.id;
                dateValue.day = attributes.getValue("Day");
                dateValue.month = attributes.getValue("Month");
                dateValue.year = attributes.getValue("Year");
                dateValue.dnotes = attributes.getValue("DNotes");
            }
            ////////////////////BirthPlace
            if ("Place".equals(qName)) {
                place = new Place();
                place.personId = person.id;
                place.name = attributes.getValue("name");
            }
            ////////////////SanctionsReferences
            if ("Reference".equals(qName)) {
                reference = new Reference();
                reference.personId = person.id;
                ///属性
                reference.sinceday = attributes.getValue("SinceDay");
                reference.sincemonth = attributes.getValue("SinceMonth");
                reference.sinceyear = attributes.getValue("SinceYear");
                reference.today = attributes.getValue("ToDay");
                reference.tomonth = attributes.getValue("ToMonth");
                reference.toyear = attributes.getValue("ToYear");
            }
            ///address
            if ("Address".equals(qName)) {
                address = new Address();
                address.personId = person.id;
            }
            //CountryDetails
            if ("Country".equals(qName)) {
                country = new Country();
                country.personId = person.id;
                country.countrytype = attributes.getValue("CountryType");
            }
            if ("CountryValue".equals(qName)) {
                country.code = attributes.getValue("Code");
            }
            //////////////IDNumberTypes
            if ("ID".equals(qName)) {
                id = new ID();
                id.personId = person.id;
                id.idtype = attributes.getValue("IDType");
            }
            if ("IDValue".equals(qName)) {
                id.idnotes = attributes.getValue("IDnotes");
            }
            if ("Source".equals(qName)) {
                source = new Source();
                source.personId = person.id;
                source.name = attributes.getValue("name");
            }
            if ("Image".equals(qName)) {
                image = new Image();
                image.personId = person.id;
                image.url = attributes.getValue("URL");
            }
        }
    }

    // 解析到每个元素的内容时会调用此方法
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (this.start) {
            //System.out.println(currTag+"="+String.valueOf(ch,start,length));
            //如果是Gender则赋值给当前person
            if ("Gender".equals(currTag) && !Objects.isNull(person)) {
                person.gender = String.valueOf(ch, start, length);
            }
            if ("ActiveStatus".equals(currTag) && !Objects.isNull(person)) {
                person.activestatus = String.valueOf(ch, start, length);
            }
            if ("Deceased".equals(currTag) && !Objects.isNull(person)) {
                person.deceased = String.valueOf(ch, start, length);
            }
            if ("ProfileNotes".equals(currTag) && !Objects.isNull(person)) {
                person.profilenotes = String.valueOf(ch, start, length);
            }
            //------------------------------namevalue---------------------------------
            //namevlaue下的TitleHonorific
            if ("TitleHonorific".equals(currTag)) {
                nameValue.titlehonorific = String.valueOf(ch, start, length);
            }
            //namevlaue下的FirstName
            if ("FirstName".equals(currTag)) {
                nameValue.firstname = String.valueOf(ch, start, length);
            }
            //namevlaue下的FirstName
            if ("MiddleName".equals(currTag)) {
                nameValue.middlename = String.valueOf(ch, start, length);
            }
            //namevlaue下的FirstName
            if ("Surname".equals(currTag)) {
                nameValue.surname = String.valueOf(ch, start, length);
            }
            //namevlaue下的MaidenName
            if ("MaidenName".equals(currTag)) {
                nameValue.maidenname = String.valueOf(ch, start, length);
            }
            //namevlaue下的Suffix
            if ("Suffix".equals(currTag)) {
                nameValue.suffix = String.valueOf(ch, start, length);
            }
            //namevlaue下的MaidenName
            if ("OriginalScriptName".equals(currTag)) {
                nameValue.originalscriptname = String.valueOf(ch, start, length);
            }
            //namevlaue下的SingleStringName>
            if ("SingleStringName".equals(currTag)) {
                nameValue.singlestringname = String.valueOf(ch, start, length);
            }
            //namevlaue下的EntityName
            if ("EntityName".equals(currTag)) {
                nameValue.entityname = String.valueOf(ch, start, length);
            }
            if ("OccTitle".equals(currTag)) {
                occTitle.value = String.valueOf(ch, start, length);
            }
            if ("Reference".equals(currTag)) {
                reference.value = String.valueOf(ch, start, length);
            }
            /////////////////////address
            if ("AddressLine".equals(currTag)) address.addressline = String.valueOf(ch, start, length);
            if ("AddressCity".equals(currTag)) address.addresscity = String.valueOf(ch, start, length);
            if ("AddressCountry".equals(currTag)) address.addresscountry = String.valueOf(ch, start, length);
            if ("URL".equals(currTag)) address.url = String.valueOf(ch, start, length);
            //IDNumebrDetails
            if ("IDValue".equals(currTag)) id.idvalue = String.valueOf(ch, start, length);
        }
    }

    // 每个元素结束的时候都会调用该方法
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //每当结束一个标签解析将其加入List然后刷入数据库
        //if ("RoleTypeList".equals(qName))start = true;//开始启动解析
        //Person总数：2658644
        if ("Person".equals(qName)){
            personList.add(person);
            if (personList.size()> Constant.FULL_FLASH_DB) {
                Person.insert(personList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                personList.clear();
            }
            person = null;
        }
        if ("NameValue".equals(qName)){
           nameValueList.add(nameValue);
           if (nameValueList.size()>Constant.FULL_FLASH_DB){
               NameValue.insert(nameValueList);
               System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
               nameValueList.clear();
           }
           nameValue = null;
        };
        //Description
        if ("Description".equals(qName)){
            descriptionList.add(description);
            if (descriptionList.size()>Constant.FULL_FLASH_DB){
                Description.insert(descriptionList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                descriptionList.clear();
            }
            description = null;
        }
        //OccTitle
        if ("OccTitle".equals(qName)){
            occTitleList.add(occTitle);
            if (occTitleList.size()>Constant.FULL_FLASH_DB){
                OccTitle.insert(occTitleList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                occTitleList.clear();
            }
            occTitle = null;
        }
        //DateValue
        if ("DateValue".equals(qName)){
            dateValues.add(dateValue);
            if (dateValues.size()>Constant.FULL_FLASH_DB){
                DateValue.insert(dateValues);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                dateValues.clear();
            }
            dateValue = null;
        }
        //Place
        if ("Place".equals(qName)){
            places.add(place);
            if (places.size()>Constant.FULL_FLASH_DB){
                Place.insert(places);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                places.clear();
            }
            place = null;
        }
        //Reference
        if ("Reference".equals(qName)){
            references.add(reference);
            if (references.size()>Constant.FULL_FLASH_DB){
                Reference.insert(references);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
            }
            reference = null;
        }
        if ("Address".equals(qName)){
            addresses.add(address);
            if (addresses.size()>Constant.FULL_FLASH_DB){
                Address.insert(addresses);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                addresses.clear();
            }
            address = null;
        }

        //Country
        if("Country".equals(qName)){
            countryList.add(country);
            if (countryList.size()>Constant.FULL_FLASH_DB){
                Country.insert(countryList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                countryList.clear();
            }
            country = null;
        }
        //ID
        if ("ID".equals(qName)){
            idList.add(id);
            if (idList.size()>Constant.FULL_FLASH_DB){
                ID.insert(idList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                idList.clear();
            }
            id = null;
        }
        //Source
        if ("Source".equals(qName)){
            sourceList.add(source);
            if (sourceList.size()>Constant.FULL_FLASH_DB){
                Source.insert(sourceList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                sourceList.clear();
            }
            image = null;
        }
        //Image
        if ("Images".equals(qName)){
            imageList.add(image);
            if (imageList.size()>Constant.FULL_FLASH_DB){
                Image.insert(imageList);
                System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                imageList.clear();
            }
            image = null;
        }



        // if ("Records".equals(qName))System.exit(0);//Entity总数：182219
        // 判断是否为一个节点结束的元素标签
    }
    // 结束解析文档，即解析根元素结束标签时调用该方法
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        //判断集合中是否还有值、有则刷入数据库
        Person.insert(personList);
        NameValue.insert(nameValueList);
        Description.insert(descriptionList);
        OccTitle.insert(occTitleList);
        DateValue.insert(dateValues);
        Place.insert(places);
        Reference.insert(references);
        Address.insert(addresses);
        Country.insert(countryList);
        ID.insert(idList);
        Source.insert(sourceList);
        Image.insert(imageList);
        System.out.println("Person总数："+count);
    }

    public static void main(String[] args) {
        SaxService.ReadXML(Constant.PARSE_FILE_PATH, "class",new ParsePersonHandler());
    }
}
