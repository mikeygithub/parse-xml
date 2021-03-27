package com.tongdun.parsexml.sax;

import com.tongdun.parsexml.config.Constant;
import com.tongdun.parsexml.entity.entity.Company;
import com.tongdun.parsexml.entity.entity.Entity;
import com.tongdun.parsexml.entity.entity.Vessel;
import com.tongdun.parsexml.entity.person.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class ParseEntityHandler extends DefaultHandler {
    List<Entity> entityList = new LinkedList<>();
    Entity entity = new Entity();
    Integer count = 0;
    String currTag;
    boolean start = false;
    //person下的子标签
    Name name;
    NameValue nameValue;
    List<NameValue> nameValueList = new LinkedList<>();
    //列表
    Description description;
    List<Description> descriptionList = new LinkedList<>();
    //DateDetails
    Date date;
    DateValue dateValue;
    List<DateValue> dateValues = new LinkedList<>();
    //SanctionsReferences
    Reference reference;
    List<Reference> references = new LinkedList<>();
    //CopanyDetails
    Company company;
    List<Company> companyList = new LinkedList<>();
    //countryDetails
    Country country;
    List<Country> countryList = new LinkedList<>();
    //IDNumberTypes
    ID id;
    List<ID> idList = new LinkedList<>();
    //SourceDetails
    Source source;
    List<Source> sourceList = new LinkedList<>();
    //vessler
    Vessel vessel;
    List<Vessel> vesselList = new LinkedList<>();

    // 开始解析文档，即开始解析XML根元素时调用该方法
    @Override
    public void startDocument() throws SAXException {
        System.out.println("--开始解析XML文档--");
    }
    // 开始解析每个元素时都会调用该方法
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//        if ("Entity".equals(qName)&&!this.start) {
//            System.out.println("开始解析Entity："+qName);
//        }
//        if ("Entity".equals(qName))this.start = true;
//        if (this.start) {
//            currTag = qName;
//            //System.out.println("当前解析标签："+qName);
//            if ("Entity".equals(qName)) {
//                entity = new Entity();
//                //设置person的属性
//                entity.id = attributes.getValue("id");
//                entity.action = attributes.getValue("action");
//                entity.date = attributes.getValue("date");
//            }
//            if ("Name".equals(qName)) {
//                //需要设置id方便NameValue关联
//                name = new Name();
//                name.nametype = attributes.getValue("NameType");
//                name.personId = entity.id;
//                //直接插入返回期自增id
//                name.id = Name.insertRetrunKey(name);
//            }
//            if ("NameValue".equals(qName)) {
//                nameValue = new NameValue();
//                nameValue.nameId = String.valueOf(name.id);
//            }
//            if ("Description".equals(qName)) {
//                description = new Description();
//                description.personId = entity.id;
//                description.description1 = attributes.getValue("Description1");
//                description.description2 = attributes.getValue("Description2");
//                description.description3 = attributes.getValue("Description3");
//            }
//            ////////////////////DateDetails
//            if ("Date".equals(qName)) {
//                date = new Date();
//                date.personId = entity.id;
//                date.datetype = attributes.getValue("DateType");
//                //直接插入返回期自增id
//                date.id = Date.insertRetrunKey(date);
//            }
//            if ("DateValue".equals(qName)) {
//                dateValue = new DateValue();
//                dateValue.dateId = date.id;
//                dateValue.day = attributes.getValue("Day");
//                dateValue.month = attributes.getValue("Month");
//                dateValue.year = attributes.getValue("Year");
//                dateValue.dnotes = attributes.getValue("Dnotes");
//            }
//            ////////////////SanctionsReferences
//            if ("Reference".equals(qName)) {
//                reference = new Reference();
//                reference.personId = entity.id;
//                ///属性
//                reference.sinceday = attributes.getValue("SinceDay");
//                reference.sincemonth = attributes.getValue("SinceMonth");
//                reference.sinceyear = attributes.getValue("SinceYear");
//                reference.today = attributes.getValue("ToDay");
//                reference.tomonth = attributes.getValue("ToMonth");
//                reference.toyear = attributes.getValue("ToYear");
//            }
//            //Vessel
//            if("VesselDetails".equals(qName)){
//                vessel = new Vessel();
//                vessel.entityId = entity.id;
//            }
//            ///CompanyDetails
//            if ("CompanyDetails".equals(qName)) {
//                company = new Company();
//                company.entityId = entity.id;
//            }
//            //CountryDetails
//            if ("Country".equals(qName)) {
//                country = new Country();
//                country.personId = entity.id;
//                country.countrytype = attributes.getValue("CountryType");
//            }
//            if ("CountryValue".equals(qName)) {
//                country.code = attributes.getValue("Code");
//            }
//            //////////////IDNumberTypes
//            if ("ID".equals(qName)) {
//                id = new ID();
//                id.personId = entity.id;
//                id.idtype = attributes.getValue("IDType");
//            }
//            if ("IDValue".equals(qName)) {
//                id.idnotes = attributes.getValue("IDnotes");
//            }
//            if ("Source".equals(qName)) {
//                source = new Source();
//                source.personId = entity.id;
//                source.name = attributes.getValue("name");
//            }
//        }
    }

    // 解析到每个元素的内容时会调用此方法
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (this.start) {
            if ("ActiveStatus".equals(currTag) && !Objects.isNull(entity)) {
                entity.activestatus = String.valueOf(ch, start, length);
            }
            if ("ProfileNotes".equals(currTag) && !Objects.isNull(entity)) {
                entity.profilenotes = String.valueOf(ch, start, length);
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
            if ("Reference".equals(currTag)) {
                reference.value = String.valueOf(ch, start, length);
            }
            //>P32C3</VesselCallSign> <>General Cargo</VesselType> <>15088</VesselTonnage> <>8909</VesselGRT> <>Alaminos Shipping Co. Ltd.</VesselOwner> <
            if ("VesselCallSign".equals(currTag)){
                vessel.VesselCallSign = String.valueOf(ch,start,length);
            }
            if ("VesselType".equals(currTag)){
                vessel.VesselType = String.valueOf(ch,start,length);
            }
            if ("VesselTonnage".equals(currTag)){
                 vessel.VesselTonnage= String.valueOf(ch,start,length);
            }
            if ("VesselGRT".equals(currTag)){
                 vessel.VesselGRT= String.valueOf(ch,start,length);
            }
            if ("VesselOwner".equals(currTag)){
                 vessel.VesselOwner= String.valueOf(ch,start,length);
            }
            if ("VesselFlag".equals(currTag)){
                 vessel.VesselFlag= String.valueOf(ch,start,length);
            }
            /////////////////////CompanyDetails
            if ("AddressLine".equals(currTag)) company.addressline = String.valueOf(ch, start, length);
            if ("AddressCity".equals(currTag)) company.addresscity = String.valueOf(ch, start, length);
            if ("AddressCountry".equals(currTag)) company.addresscountry = String.valueOf(ch, start, length);
            if ("URL".equals(currTag)) company.url = String.valueOf(ch, start, length);
            //IDNumebrDetails
            if ("IDValue".equals(currTag)) id.idvalue = String.valueOf(ch, start, length);
        }
    }

    // 每个元素结束的时候都会调用该方法
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //Person总数：2658644
        if (this.start) {
            if ("Entity".equals(qName)) {
                entityList.add(entity);
                if (entityList.size() > 10) {
                    Entity.insert(entityList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    entityList.clear();
                }
                entity = null;
            }
            if ("NameValue".equals(qName)) {
                nameValueList.add(nameValue);
                if (nameValueList.size() > Constant.FULL_FLASH_DB) {
                    NameValue.insert(nameValueList);
                    System.out.println("向数据库刷入数据:"+qName+ Constant.FULL_FLASH_DB+"条:"+qName);
                    nameValueList.clear();
                }
                nameValue = null;
            }
            ;
            //Description
            if ("Description".equals(qName)) {
                descriptionList.add(description);
                if (descriptionList.size() > Constant.FULL_FLASH_DB) {
                    Description.insert(descriptionList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    descriptionList.clear();
                }
                description = null;
            }
            //DateValue
            if ("DateValue".equals(qName)) {
                dateValues.add(dateValue);
                if (dateValues.size() > Constant.FULL_FLASH_DB) {
                    DateValue.insert(dateValues);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    dateValues.clear();
                }
                dateValue = null;
            }
            //Reference
            if ("Reference".equals(qName)) {
                references.add(reference);
                if (references.size() > Constant.FULL_FLASH_DB) {
                    Reference.insert(references);
                    references.clear();
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                }
                reference = null;
            }
            if ("CompanyDetails".equals(qName)) {
                companyList.add(company);
                if (companyList.size() > Constant.FULL_FLASH_DB) {
                    Company.insert(companyList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    companyList.clear();
                }
                company = null;
            }

            //Country
            if ("Country".equals(qName)) {
                countryList.add(country);
                if (countryList.size() > Constant.FULL_FLASH_DB) {
                    Country.insert(countryList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    countryList.clear();
                }
                country = null;
            }
            //ID
            if ("ID".equals(qName)) {
                idList.add(id);
                if (idList.size() > Constant.FULL_FLASH_DB) {
                    ID.insert(idList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    idList.clear();
                }
                id = null;
            }
            //Source
            if ("Source".equals(qName)) {
                sourceList.add(source);
                if (sourceList.size() > Constant.FULL_FLASH_DB) {
                    Source.insert(sourceList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    sourceList.clear();
                }
                source = null;
            }
            //vessel
            if ("VesselDetails".equals(qName)) {
                vesselList.add(vessel);
                if (vesselList.size() > Constant.FULL_FLASH_DB) {
                    Vessel.insert(vesselList);
                    System.out.println("向数据库刷入数据:"+qName+Constant.FULL_FLASH_DB+"条:"+qName);
                    vesselList.clear();
                }
                vessel = null;
            }
        }

        // if ("Records".equals(qName))System.exit(0);//Entity总数：182219
        // 判断是否为一个节点结束的元素标签
    }
    // 结束解析文档，即解析根元素结束标签时调用该方法
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        //判断集合中是否还有值、有则刷入数据库
        Entity.insert(entityList);
        NameValue.insert(nameValueList);
        Description.insert(descriptionList);
        DateValue.insert(dateValues);
        Reference.insert(references);
        Company.insert(companyList);
        Country.insert(countryList);
        ID.insert(idList);
        Vessel.insert(vesselList);
        Source.insert(sourceList);
        System.out.println("Entity总数："+count);
    }

    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();
        SaxService.ReadXML(Constant.PARSE_FILE_PATH, "class",new ParseEntityHandler());
        System.out.printf("解析耗时:");
        System.out.println(((System.currentTimeMillis()-startTime) / 1000)+"秒");
    }
}
