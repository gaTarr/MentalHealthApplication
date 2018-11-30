-- MySQL dump 10.13  Distrib 5.7.23, for Win64 (x86_64)
--
-- Host: localhost    Database: mental_health_app
-- ------------------------------------------------------
-- Server version	5.7.23-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clinics`
--

DROP TABLE IF EXISTS `clinics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinics` (
  `idClinic` int(11) NOT NULL AUTO_INCREMENT,
  `clinicName` varchar(100) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `webaddress` text,
  PRIMARY KEY (`idClinic`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinics`
--

LOCK TABLES `clinics` WRITE;
/*!40000 ALTER TABLE `clinics` DISABLE KEYS */;
INSERT INTO `clinics` VALUES (1,'Ames Counseling and Psychological Services','Ames','IA','https://www.amespsych.com/'),(2,'Ardent Community Wellness Center','Marshalltown','IA','https://www.acwcil.org/'),(3,'Associates for Behavioral Care','Hiawatha','IA','http://www.assocbhc.com/'),(4,'Burgess Health Center','Onawa','IA','https://www.burgesshc.org/services/mental-health/'),(5,'Central Iowa Psychological Services','West Des Moines','IA','http://iowacounseling.com/older-adult-counseling/'),(6,'Central Iowa Therapy Solutions','Clive','IA','http://www.centraliowatherapysolutions.com/'),(7,'Childserve','Johnston','IA','https://www.childserve.org/behavioral-health/mental-health-therapy/'),(8,'Compass Clinical Associates','Urbandale','IA','http://www.compassclinicalassociates.com/'),(9,'Cornerstone Wellness Center','Clinton','IA','http://www.clintoncornerstone.com/'),(10,'Counseling and Health Center','Iowa City','IA','http://iowacitycounselors.com/'),(11,'Floyd Valley Healthcare','Le Mars','IA','https://www.floydvalley.org/behavioral-health.html'),(12,'Fort Madison Community Hospital','Fort Madison','IA','https://www.fmchosp.com/clinic-services/psychiatry/'),(13,'Great River Health System','West Burlington','IA','https://www.greatriverhealthsystem.org/Health-Services/Mental-Health.aspx'),(14,'Guthrie County Hospital','Guthrie Center','IA','https://guthriecountyhospital.org/mental-health/'),(15,'Horizons','Cedar Rapids','IA','http://www.horizonsfamily.org/how-we-help/mental-health-wellness/'),(16,'Iowa Ketamine Clinic','Urbandale','IA','http://www.iowaketamine.com/'),(17,'Iowa Psychiatry','Urbandale','IA','http://www.iowapsychiatry.com/'),(18,'Iowa Specialty Hospitals & Clinics','Belmond','IA','https://www.iowaspecialtyhospital.com/services/counseling-and-therapy-services'),(19,'Integrative Counseling Solutions','West Des Moines','IA','https://www.integrativecs.net/personal-mental-health.php'),(20,'Medical Associates','Dubuque','IA','https://www.mahealthcare.com/doctors-clinics/browse-specialties/psychiatry-psychology'),(21,'Mercy Behavioral Health','Des Moines','IA','http://www.mercydesmoines.org/behavioralhealth'),(22,'Mercy North Iowa','Mason City','IA','http://www.mercynorthiowa.com/outpatient-services'),(23,'Mercy Outpatient','Cedar Rapids','IA','https://www.mercycare.org/services/behavioral-services/outpatient-psychiatry/'),(24,'Methodist Jennie Edmundson Hospital Psychiatric Service','Council Bluffs','IA','https://www.bestcare.org/jennie-edmundson/services/behavioral-health/'),(25,'Midwest Counseling','Grinnell','IA','https://www.midwestcounselingllc.com/'),(26,'New Directions Mental Health Counseling','Storm Lake','IA','https://www.counselingstormlake.com/'),(27,'Northeast Iowa Family Practice Center','Waterloo','IA','http://www.familypracticecenter.org/services/mental-health-counseling.aspx'),(28,'Pathways','Waterloo','IA','https://www.pathwaysb.org/mental-health-services/'),(29,'Peace of Mind Counseling Services','Indianola','IA','http://peaceofmindindianola.com/'),(30,'Pine Rest Christian Mental Health Services','Pella','IA','https://www.pinerest.org/locations/iowa/'),(31,'Plains Area Mental Health Center','Le Mars','IA','http://plainsareamentalhealth.org/'),(32,'Prairie Wellness','Des Moines','IA','https://www.prairiewellness.com/'),(33,'Quad City Women\'s Therapy','Bettendorf','IA','http://qcwomenstherapy.com/'),(34,'St. Anthony Regional Hospital','Carroll','IA','https://www.stanthonyhospital.org/services/mental-health/'),(35,'Seasons','Spencer','IA','https://seasonscenter.org/outpatient-psychiatric-services.php'),(36,'Shawna Johansen','Ankeny','IA','https://www.shawnajohansen.com/'),(37,'Southern Iowa Mental Health Center','Ottumwa','IA','https://www.simhcottumwa.org/'),(38,'Therapists in Ankeny','Ankeny','IA','https://www.psychologytoday.com/us/therapists/ia/ankeny'),(39,'Therapists in Des Moines','Des Moines','IA','https://www.psychologytoday.com/us/therapists/ia/des-moines'),(40,'TRICARE Therapists in West Des Moines','West Des Moines','IA','https://www.psychologytoday.com/us/therapists/tricare/ia/west-des-moines'),(41,'Unity Point Clinic - Des Moines Psychiatry','West Des Moines','IA','https://www.unitypoint.org/desmoines/iowa-health-psychiatry.aspx'),(42,'Unity Point Clinic Mental Health','Des Moines','IA','http://www.unitypoint.org/clinic.aspx?id=71'),(43,'University of Iowa Hospitals and Clinics, Family Medicine Clinic','Iowa City','IA','https://uihc.org/health-topics/anxiety-and-depression'),(44,'VA Central Iowa Health Care System','Des Moines','IA','https://www.centraliowa.va.gov/services/Mental_Health.asp'),(45,'Winneshiek Medical Center Clinic','Decorah','IA','http://www.winmedical.org/our-services/clinics/behavioral-health/');
/*!40000 ALTER TABLE `clinics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facilities`
--

DROP TABLE IF EXISTS `facilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facilities` (
  `idFacility` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `city` varchar(45) NOT NULL,
  `state` varchar(45) DEFAULT NULL,
  `webaddress` text,
  PRIMARY KEY (`idFacility`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facilities`
--

LOCK TABLES `facilities` WRITE;
/*!40000 ALTER TABLE `facilities` DISABLE KEYS */;
INSERT INTO `facilities` VALUES (1,'Broadlawns Medical Center','Des Moines','IA','https://www.broadlawns.org/adult-psychiatric-unit.cfm'),(2,'Genesis Health System','Davenport','IA','http://www.genesishealth.com/care-treatment/behavioral-health/'),(3,'Mary Greeley Medical Center','Ames','IA','https://www.mgmc.org/medical-services/behavioral-health/'),(4,'Mercy Iowa City','Iowa City','IA','https://www.mercyiowacity.org/Default.aspx?id=87&sid=1&CWFriendlyUrl=true'),(5,'Mercy Medical Center','Des Moines','IA','http://www.mercydesmoines.org/behavioralhealth/adult-behavioral-services'),(6,'Mercy North Iowa','Mason City','IA','http://www.mercynorthiowa.com/inpatient-services'),(7,'Methodist Jennie Edmundson Hospital','Council Bluffs','IA','https://www.bestcare.org/jennie-edmundson/services/behavioral-health/'),(8,'Ottumwa Regional Health Center','Ottumwa','IA','https://www.ottumwaregionalhealth.com/services/senior-behavioral-care-center/'),(9,'St. Anthony Regional Hospital','Carroll','IA','https://www.stanthonyhospital.org/services/mental-health/'),(10,'Unity Point Health','Des Moines','IA','https://www.unitypoint.org/desmoines/services-adult-mental-health-services.aspx'),(11,'University of Iowa Health Care','Iowa City','IA','https://medicine.uiowa.edu/psychiatry/patient-care/welcome');
/*!40000 ALTER TABLE `facilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medications`
--

DROP TABLE IF EXISTS `medications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medications` (
  `idMed` int(11) NOT NULL AUTO_INCREMENT,
  `brandName` varchar(100) DEFAULT NULL,
  `genericName` varchar(100) DEFAULT NULL,
  `type` varchar(75) DEFAULT NULL,
  `webaddress` text,
  PRIMARY KEY (`idMed`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medications`
--

LOCK TABLES `medications` WRITE;
/*!40000 ALTER TABLE `medications` DISABLE KEYS */;
INSERT INTO `medications` VALUES (1,'Abilify','aripiprazole','Atypical','https://www.webmd.com/drugs/2/drug-64439/abilify-oral/details'),(2,'Adapin','doxepin','TCA','https://www.webmd.com/drugs/2/drug-8647-610/doxepin-oral/doxepin-capsule-oral/details'),(3,'Anafranil','clomipramine','TCA','https://www.webmd.com/drugs/2/drug-1776/anafranil-oral/details'),(4,'Aplenzin','bupropion','Bupropion','https://www.webmd.com/drugs/2/drug-151973/aplenzin-oral/details'),(5,'Asendin','amoxapine','TeCA','https://www.webmd.com/drugs/2/drug-6171/asendin-oral/details'),(6,'Aventyl HCI','nortriptyline','TCA','https://www.webmd.com/drugs/2/drug-6172/aventyl-oral/details'),(7,'Buspar','buspirone','Other','https://www.webmd.com/drugs/2/drug-9036/buspar-oral/details'),(8,'Celexa','citalopram','SSRI','https://www.webmd.com/drugs/2/drug-1701/citalopram-oral/details'),(9,'Cipralex','escitalopram','SSRI','https://www.medbroadcast.com/drug/getdrug/cipralex'),(10,'Cymbalta','duloxetine','SNRI','https://www.webmd.com/drugs/2/drug-91491/cymbalta-oral/details'),(11,'Desyrel','trazodon','SARI','https://www.webmd.com/drugs/2/drug-6750/desyrel-oral/details'),(12,'Effexor','venlafaxine','SNRI','https://www.webmd.com/drugs/2/drug-1836/effexor-oral/details'),(13,'Effexor XR','venlafaxine','SNRI','https://www.webmd.com/drugs/2/drug-4896/effexor-xr-oral/details'),(14,'Elavil','amitriptyline','TCA','https://www.webmd.com/drugs/2/drug-1807/elavil-oral/details'),(15,'EMSAM Patch','selegiline','MAOI','https://www.webmd.com/drugs/2/drug-95354/emsam-transdermal/details'),(16,'Endep','amitriptyline','TCA','https://www.webmd.com/drugs/2/drug-9159/endep-oral/details'),(17,'Eskalith','lithium carbonate','Other','https://www.webmd.com/drugs/2/drug-9170/eskalith-oral/details'),(18,'Eskalith CR','lithium carbonate','Other','https://www.webmd.com/drugs/2/drug-3791/eskalith-cr-oral/details'),(19,'Etrafon','perphenazine-amitriptyline','Combination','https://www.webmd.com/drugs/2/drug-16109/etrafon-2-25-oral/details'),(20,'Fetzima','levomilnacipran','SNRI','https://www.webmd.com/drugs/2/drug-165446/fetzima-oral/details'),(21,'Khedezla','desvenlafaxine','SNRI','https://www.webmd.com/drugs/2/drug-164859/khedezla-oral/details'),(22,'Lamictal','lamotrigine','Atypical','https://www.webmd.com/drugs/2/drug-8486-4217/lamictal-oral/lamotrigine-chewable-dispersible-tablet-oral/details'),(23,'Latuda','lurasidone','Atypical','https://www.webmd.com/drugs/2/drug-155134/latuda-oral/details'),(24,'Lexapro','escitalopram oxalate','SSRI','https://www.webmd.com/drugs/2/drug-63990/lexapro-oral/details'),(25,'Limbitrol','amitriptyline-chlordiazepoxide','Combination','https://www.webmd.com/drugs/2/drug-16020/limbitrol-ds-oral/details'),(26,'Lithobid','lithium carbonate','Other','https://www.webmd.com/drugs/2/drug-6874/lithobid-oral/details'),(27,'Ludiomil','maprotiline','TeCA','https://www.webmd.com/drugs/2/drug-6886/ludiomil-oral/details'),(28,'Luvox','fluvoxamine','SSRI','https://www.webmd.com/drugs/2/drug-1089/luvox-oral/details'),(29,'Luvox CR','luvoxamine','SSRI','https://www.webmd.com/drugs/2/drug-150188/luvox-cr-oral/details'),(30,'Marplan','isocarboxazid','MAOI','https://www.webmd.com/drugs/2/drug-11985/marplan-oral/details'),(31,'Nardil','phenelzine','MAOI','https://www.webmd.com/drugs/2/drug-8827/phenelzine-oral/details'),(32,'Norpramin','desipramine','TCA','https://www.webmd.com/drugs/2/drug-6936/norpramin-oral/details'),(33,'Oleptro','trazadone','Atypical','https://www.webmd.com/drugs/2/drug-154303/oleptro-er-oral/details'),(34,'Pamelor','nortriptyline','TCA','https://www.webmd.com/drugs/2/drug-1820/pamelor-oral/details'),(35,'Parnate','tranylcypromine','MAOI','https://www.webmd.com/drugs/2/drug-6965/parnate-oral/details'),(36,'Paxil','paroxetine hcl','SSRI','https://www.webmd.com/drugs/2/drug-6969-9095/paroxetine-oral/paroxetine-oral/details'),(37,'Paxil CR','paroxetine hcl','SSRI','https://www.webmd.com/drugs/2/drug-32900/paxil-cr-oral/details'),(38,'Pertofrane','desipramine','TCA','https://www.sdrugs.com/?c=drug&s=pertofrane'),(39,'Pexeva','paroxetine mesylate','SSRI','https://www.webmd.com/drugs/2/drug-78102/pexeva-oral/details'),(40,'Pristiq','desvenlafaxine succinate','SNRI','https://www.webmd.com/drugs/2/drug-150251/pristiq-oral/details'),(41,'Prozac','fluoxetine','SSRI','https://www.webmd.com/drugs/2/drug-6997/prozac-oral/details'),(42,'Remeron','mirtazapine','TeCA','https://www.webmd.com/drugs/2/drug-13706-2047/mirtazapine-oral/mirtazapine-disintegrating-tablet-oral/details'),(43,'Rexulti','brexpiprazole','Atypical','https://www.webmd.com/drugs/2/drug-169294/rexulti-oral/details'),(44,'Sarafem','fluoxetine','SSRI','https://www.webmd.com/drugs/2/drug-19825/sarafem-oral/details'),(45,'Savella','milnacipran','SNRI','https://www.webmd.com/drugs/2/drug-152224/savella-oral/details'),(46,'Serequel','quetiapine','Atypical','https://www.webmd.com/drugs/2/drug-4718/seroquel-oral/details'),(47,'Serequel XR','quetiapine','Atypical','https://www.webmd.com/drugs/2/drug-148614/seroquel-xr-oral/details'),(48,'Serzone','nefazodone hcl','Atypical','https://www.webmd.com/drugs/2/drug-4286/nefazodone-oral/details'),(49,'Sinequan','doxipin','TCA','https://www.webmd.com/drugs/2/drug-3335-610/sinequan-oral/doxepin-capsule-oral/details'),(50,'Surmontil','trimipramine','TCA','https://www.webmd.com/drugs/2/drug-7032/trimipramine-oral/details'),(51,'Symbyax','olanzapine-fluoxetine','Combination','https://www.webmd.com/drugs/2/drug-78212/symbyax-oral/details'),(52,'Tofranil','imipramine hcl','TCA','https://www.webmd.com/drugs/2/drug-7047/tofranil-oral/details'),(53,'Triavil','perphenazine-amitriptyline','Combination','https://www.webmd.com/drugs/2/drug-57378/triavil-4-10-oral/details'),(54,'Trintiellix','vortioxetine','SMS','https://www.webmd.com/drugs/2/drug-167367/trintellix-oral/details'),(55,'Viibryd','vilazodone','SMS','https://www.webmd.com/drugs/2/drug-155880/viibryd-oral/details'),(56,'Vivactil','protriptyline','TCA','https://www.webmd.com/drugs/2/drug-12169/vivactil-oral/details'),(57,'Wellbutrin','bupropion hcl','NDRI','https://www.webmd.com/drugs/2/drug-13509/wellbutrin-oral/details'),(58,'Zoloft','sertraline','SSRI','https://www.webmd.com/drugs/2/drug-35-8095/zoloft-oral/sertraline-oral/details'),(59,'Zyprexa','olanzapine','Atypical','https://www.webmd.com/drugs/2/drug-1699/zyprexa-oral/details');
/*!40000 ALTER TABLE `medications` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scores`
--

DROP TABLE IF EXISTS `scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scores` (
  `idScore` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) DEFAULT NULL,
  `date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'We want this field to auto-populate the system date when the row is created.  ',
  `idUser` int(11) DEFAULT NULL,
  PRIMARY KEY (`idScore`),
  KEY `idUser_idx` (`idUser`),
  CONSTRAINT `idUser` FOREIGN KEY (`idUser`) REFERENCES `users` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scores`
--

LOCK TABLES `scores` WRITE;
/*!40000 ALTER TABLE `scores` DISABLE KEYS */;
INSERT INTO `scores` VALUES (1,14,'2018-11-30 22:00:13',1),(2,7,'2018-10-01 20:20:10',1),(3,23,'2018-05-23 13:25:00',1),(4,6,'2018-01-01 21:20:10',2),(5,12,'2018-03-01 21:20:10',2),(6,16,'2018-05-01 20:20:10',2),(7,19,'2018-06-01 20:20:10',2),(8,26,'2018-09-01 20:20:10',2),(9,45,'2018-10-01 20:20:10',3),(10,-1,'2018-03-01 21:20:10',3),(11,20,'2018-08-01 20:20:10',3);
/*!40000 ALTER TABLE `scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'testusername','testusername'),(2,'johndoe','password'),(3,'johnsmith','password123');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-30 16:22:02
