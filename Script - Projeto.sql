-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projeto
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno` (
  `matricula` varchar(12) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sobrenome` varchar(255) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `numero_rua` varchar(10) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `fone1` varchar(45) DEFAULT NULL,
  `fone2` varchar(45) DEFAULT NULL,
  `placa_car` varchar(45) DEFAULT NULL,
  `id_curso` int DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `placa_car_idx` (`placa_car`),
  KEY `id_curso_idx` (`id_curso`),
  CONSTRAINT `id_curso` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`id_curso`),
  CONSTRAINT `placa_car` FOREIGN KEY (`placa_car`) REFERENCES `veiculo` (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES ('201111066-4','BRUNNA','JULLYANA CORREIA DE MELO','F','Casa Forte','874','901','(44) 11187-9227','(58) 20076-7544','JYR-9046',33),('201120000-1','ADRIANA','BARBALHO RAMOS','F','Casa Amarela','845','402','(17) 61739-3714','(47) 59684-6182','KMA5377',9),('201120047-6','DANIELY','TAVARES MELLO','F','Cabanga','144','702','(34) 49264-7236','(58) 81751-7353','JQO-2586',9),('201120532-9','ALFREDO','NUNES DA SILVA NETO','M','Cabanga','946','702','(31) 31465-9171','(15) 12061-5708','KJR1768',4),('201120591-9','FERNANDO','ANTONIO DE MORAIS MELO FILHO','M','Boa Viagem','755','101','(73) 31924-5852','(31) 52030-2642','MPZ-0549',33),('201123015-2','ADRYELLE','FERNANDES DUARTE','F','Campina do Barreto','256','301','(37) 70766-9005','(26) 88663-5194','KHN9230',33),('201210441-0','CAIO','LINS DE ALBURQUERQUE','M','Imbiribeira','978','202','(27) 36558-9988','(27) 65249-3655','KCA-2084',9),('201210697-0','BYANCA','MONALISA DE SOUSA OLIVEIRA','F','Aflitos','222','102','(15) 78299-9581','(40) 12022-2899','MGR-8435',2),('201211010-3','BRUNO','GALDINO DE FREITAS','M','Imbiribeira','252','302','(78) 58602-8692','(18) 53237-9206','MPR-0153',7),('201211134-3','BRUNNA','STEFANNY DE GOIS SILVA','F','Arruda','586','802','(54) 17729-4631','(11) 13456-8381','HQW-5883',33),('201211137-0','DÉBORA','MARIA MARQUES CAMELO','F','Boa Viagem','322','402','(56) 18573-6313','(19) 53726-1890','NEL-8303',33),('201213046-5','ALEXIA','PAULA DA SILVA MENDONÇA','F','Apipucos','136','103','(63) 28197-1707','(73) 57300-4640','KLF0977',9),('201213056-3','ARIANA','ALVES DOS SANTOS','F','Arruda','236','502','(79) 49852-9130','(61) 57297-5747','KKC4696',33),('201213080-3','ANDRIELLY','STEPHANY GUTIERRES SILVA','F','Cabanga','425','701','(57) 74633-6431','(50) 75400-2177','KKD8102',9),('201213099-3','ELIZABETE','DE SOUZA PEREIRA','F','Dois Irmãos','266','602','(26) 79907-7603','(14) 12421-7849','HRH-5779',33),('201227026-0','CARLOS','MANOEL DA SILVA JUNIOR','M','Afogados','988','601','(72) 71747-7248','(36) 63833-5098','MSW-9664',25),('201310265-2','EDUARDA','PEIXOTO DA CUNHA FRANÇA','F','Arruda','288','101','(13) 22784-8519','(41) 41873-6485','NBQ-3263',9),('201310605-2','CARINA','PEREIRA DOS SANTOS DA SILVA','F','Derby','936','601','(28) 20038-2152','(80) 42640-7856','AAN-6399',20),('201310842-2','ALEXANDRE','AUGUSTO PAREDES SELVA FILHO','M','Arruda','475','101','(54) 73517-6129','(16) 60027-9793','KJJ5910',3),('201310993-0','CAMILA','BARRETTO RIQUE DE BARROS','F','Boa Viagem','888','901','(13) 69326-5682','(52) 32215-9689','DQK-3156',4),('201311195-6','EDUARDA','ISABELLA MOURA CASTRO','F','Boa Vista','177','302','(80) 16188-9325','(15) 16114-1566','NFA-4942',33),('201313073-7','ANA','CAROLINE ALVES LEITÃO','F','Ilha Joana Bezerra','37','402','(15) 29692-7283','(63) 70253-6862','KFN7727',9),('201313147-6','CARLA','MARTINS DO NASCIMENTO','F','Imbiribeira','147','401','(37) 31024-0522','(19) 18812-5147','JUV-2095',18),('201320025-0','ANDRESSA','DE OLIVEIRA PLETSCH','F','Linha do Tiro','852','202','(70) 55575-0360','(59) 88672-3459','KLB5700',9),('201320031-2','ARTHUR','DE ARRUDA CARVALHO','M','Aflitos','269','402','(54) 79194-9117','(15) 79749-1210','KKK7195',9),('201320037-1','BIANCA','CABRAL VENTURA','F','Casa Forte','135','801','(82) 50376-1415','(22) 55851-3955','KHN0527',9),('201323007-1','CARLOS','ALBERTO DE SOUZA LIMA JUNIOR','M','Boa Viagem','522','501','(13) 42182-4987','(27) 50795-3085','EEN-3530',9),('201410217-4','EDUARDO','DA SILVA FRANÇA','M','Areias','844','202','(61) 18198-7682','(56) 14137-6183','MVZ-2876',14),('201410725-0','CARLOS','HENRIQUE FELIX DANTAS','M','Graças','455','701','(78) 23525-2775','(88) 70470-2372','KAO-7319',9),('201410733-0','DYEGO','JOSÉ HOLANDA PESSOA','M','Afogados','966','602','(75) 15722-4701','(33) 27872-6973','LVG-4013',9),('201411184-3','ANDERSON','FLÁVIO PAIVA ALVES','M','Iputinga','486','502','(45) 17969-4328','(38) 40518-0865','KKE1021',18),('201411188-0','EDUARDA','DE ALBUQUERQUE FERREIRA BARBOSA','F','Ilha do Leite','399','401','(48) 67716-4355','(85) 27462-1414','MZO-7525',18),('201411189-9','ELIANE','GLEYCE DA COSTA','F','Boa Viagem','866','501','(25) 49642-9843','(49) 67062-7320','MNH-3721',18),('201411212-5','DEYSIANE','DAMÁSIO DA SILVA','F','Aflitos','211','501','(75) 86246-4623','(16) 85271-5287','MZT-1329',19),('201411564-6','CLARYSSA','LACE FREIRE DOS SANTOS','F','Ilha do Leite','788','401','(10) 11507-0376','(37) 27456-8649','BJV-1545',37),('201413168-6','ALISSON','SILVA DE ALBUQUERQUE','M','Dois Unidos','29','701','(23) 58331-2780','(35) 66478-0143','KHG9445',4),('201413171-0','ALINE','HADASSA GOUVEIA GOMES','F','Dois Irmãos','21','802','(44) 79469-7993','(68) 74468-5283','KHW6338',4),('201413200-1','ARIELA','ROCHA CAVALCANTI','F','Graças','785','202','(67) 36264-7569','(41) 27201-7693','KID4065',4),('201415028-9','EDILISSE','MARIA DE ALMEIDA RODRIGUES','F','Arruda','544','502','(28) 37365-8521','(63) 20149-6741','KLB-7307',9),('201420193-1','DANYELLE','DO NASCIMENTO ROLIM MEDEIROS LOPES','F','Derby','455','902','(81) 30468-8839','(15) 76114-9167','NDZ-7430',9),('201420511-7','DANILO','DE OLIVEIRA E SILVA','M','Boa Vista','766','802','(56) 70117-0888','(78) 51387-7383','MPR-8953',18),('201420623-0','AMANDA','FRANÇA CRUZ XIMENES','F','Encruzilhada','25','901','(28) 55597-9232','(24) 15454-9695','KHW5535',35),('201420624-0','AMANDA','LUCAS FREIRE','F','Fundão','64','602','(51) 85381-1786','(45) 65914-4601','KHA0182',35),('201420628-6','BARBARA','AZEVEDO NEVES CAVALCANTI','F','Derby','845','602','(34) 88881-2701','(43) 78268-0392','KKF9344',35),('201420630-1','BIANCA','VICTORINO SANTOS DE MORAES','F','Boa Vista','695','701','(18) 71361-3785','(84) 82114-5561','KMB9894',35),('201420632-0','DANIELLY','MELO BRASIL','F','Areias','633','202','(44) 35720-3262','(53) 67597-2413','AKW-9712',35),('201420636-6','ERIKA','MANUELLA FIGUEIROA BARRETTO','F','Boa Viagem','244','902','(16) 70615-2146','(12) 73555-5851','MZQ-2355',35),('201420733-6','FERNANDA','THAYNA MAGALHAES DE MORAES','F','Aflitos','955','701','(34) 23743-6847','(36) 26755-0730','JBT-9954',9),('201428001-3','ARIANE','INGRID DA SILVA BOTELHO','F','Nova Descoberta','248','101','(17) 72776-8380','(79) 82320-5399','KGH3627',18),('201517079-6','FERNANDA','DE FARIAS MARTINS','F','Derby','155','802','(46) 19270-7194','(76) 71299-8731','HPU-0885',34);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `convidado`
--

DROP TABLE IF EXISTS `convidado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `convidado` (
  `cpf` varchar(20) NOT NULL,
  `data_entrada` date DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sobrenome` varchar(255) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `numero_rua` varchar(10) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `fone1` varchar(45) DEFAULT NULL,
  `fone2` varchar(45) DEFAULT NULL,
  `placa_car` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cpf`),
  KEY `placa_car_idx` (`placa_car`),
  CONSTRAINT `placa_carro` FOREIGN KEY (`placa_car`) REFERENCES `veiculo` (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `convidado`
--

LOCK TABLES `convidado` WRITE;
/*!40000 ALTER TABLE `convidado` DISABLE KEYS */;
INSERT INTO `convidado` VALUES ('006.162.539-66','2023-08-27','Bianca','Gonçalves Dias','F','Derby','285','601','(62) 66977-8634','(56) 58065-1239','BEZ-4215'),('058.928.206-96','2022-07-12','Brenda','Araujo Ferreira','F','Boa Viagem','396','502','(66) 69128-7472','(63) 84276-9492','HZS-0445'),('095.497.541-38','2023-12-29','Larissa','Pereira Rocha','F','Boa Viagem','987','901','(56) 80814-5633','(17) 73659-9149','MNP-8480'),('120.227.278-94','2022-06-08','Erick','Barbosa Castro','M','Derby','965','502','(20) 88948-2421','(55) 85098-8432','ABV-1000'),('167.577.298-30','2022-01-20','Gabriela','Gomes Azevedo','F','Ipsep','167','302','(59) 78629-2064','(30) 25669-5200','MXE-3053'),('172.315.701-51','2022-04-04','Alice','Ribeiro Cavalcanti','F','Iputinga','957','901','(43) 29993-0950','(20) 54452-4394','HYK-7933'),('218.864.028-41','2022-10-08','Júlia','Azevedo Silva','F','Linha do Tiro','846','701','(26) 87394-9322','(80) 84108-8989','JFZ-8605'),('269.311.591-43','2022-06-08','Felipe','Gomes Cavalcanti','M','Encruzilhada','761','301','(32) 53451-2243','(40) 86425-7758','NEW-5699'),('381.993.291-73','2023-03-30','Leonor','Lima Santos','F','Cordeiro','654','401','(69) 56137-8654','(56) 31798-5667','MXV-9650'),('433.894.400-54','2022-03-17','Eduarda','Silva Carvalho','F','Jordão','879','702','(78) 29871-0676','(13) 51961-9111','NDD-3379'),('445.620.254-84','2022-08-21','Kauê','Gonçalves Rodrigues','M','Jordão','195','402','(70) 88699-2447','(62) 40219-3439','LWN-8696'),('514.842.751-52','2022-06-05','Paulo','Alves Ribeiro','M','Boa Vista','375','902','(78) 68646-4570','(43) 57890-5370','KUQ-0110'),('550.393.270-64','2022-01-22','Renan','Souza Pinto','M','Encruzilhada','265','601','(59) 68185-5196','(71) 41878-8417','MNO-7194'),('557.621.920-16','2022-04-24','Marisa','Cardoso Ferreira','F','Cabanga','521','401','(23) 76292-7293','(86) 70712-9306','MQY-6031'),('589.284.156-16','2023-01-15','João','Cavalcanti Rodrigues','M','Boa Viagem','391','102','(61) 21875-0588','(79) 14937-9183','HSW-1128'),('601.561.380-77','2022-10-18','Victor','Santos Silva','M','Graças','745','202','(45) 21643-8395','(24) 73418-7576','MZT-2776'),('614.988.599-25','2022-09-25','Caio','Gomes Rocha','M','Ilha Joana Bezerra','465','802','(22) 76588-9117','(84) 43247-1328','MMO-9799'),('641.915.289-55','2022-06-08','Isabelle','Rocha Correia','F','Boa Viagem','417','102','(38) 47567-8476','(13) 52294-1348','IAO-1085'),('658.530.928-63','2022-05-09','Antônio','Rodrigues Gomes','M','Jordão','546','902','(43) 57748-2566','(77) 81925-5155','GZG-8234'),('690.085.301-39','2023-05-22','Lavinia','Azevedo Dias','F','Boa Viagem','852','602','(24) 13412-0459','(40) 32722-2416','HZZ-8698'),('710.714.551-76','2022-02-12','Rodrigo','Cunha Castro','M','Fundão','285','202','(70) 10160-5848','(47) 27028-5922','ADN-8022'),('739.031.927-59','2023-08-21','Giovanna','Costa Martins','F','Imbiribeira','741','402','(87) 15375-2872','(30) 13177-7190','JWA-9558'),('805.020.350-64','2022-04-15','Miguel','Pereira Barbosa','M','Imbiribeira','173','202','(65) 24615-6893','(24) 39962-1996','NBY-7152'),('822.277.415-89','2023-11-19','Aline','Cardoso Pinto','F','Ibura','321','502','(14) 33465-8736','(40) 39738-6317','MSO-7495'),('887.388.564-09','2022-06-23','Victor','Fernandes Castro','M','Boa Viagem','231','502','(27) 64538-9974','(63) 34837-3151','LSU-1264'),('893.103.366-41','2022-11-26','Carlos','Castro Gomes','M','Casa Forte','452','802','(12) 60178-2642','(33) 40479-0567','HZM-2121'),('922.590.355-31','2022-01-03','Manuela','Almeida Ferreira','F','Arruda','365','101','(26) 53144-9531','(84) 35736-6001','HZN-9115'),('928.709.455-15','2023-01-29','Ana','Gonçalves Araujo','F','Cabanga','963','802','(17) 82363-6623','(42) 81478-7057','MXU-7124'),('957.702.919-15','2022-12-16','Vitor','Alves Gomes','M','Aflitos','125','602','(43) 66902-9299','(45) 50422-1004','IAD-2103'),('988.296.780-90','2022-05-25','Melissa','Alves Pinto','F','Nova Descoberta','458','301','(68) 61170-6983','(25) 48393-0839','HPG-8326');
/*!40000 ALTER TABLE `convidado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id_curso` int NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `id_dep` int DEFAULT NULL,
  PRIMARY KEY (`id_curso`),
  KEY `id_depart_idx` (`id_dep`),
  CONSTRAINT `id_depart` FOREIGN KEY (`id_dep`) REFERENCES `departamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Ciência da Computação - Bacharelado',1),(2,'Arquitetura e Urbanismo - Bacharelado',1),(3,'Engenharia Ambiental - Bacharelado',1),(4,'Engenharia Civil - Bacharelado',1),(5,'Engenharia da Complexidade - Bacharelado',1),(6,'Engenharia de Produção - Bacharelado',1),(7,'Engenharia Química - Bacharelado',1),(8,'Sistemas para Internet - Curso Superior Tecnológico',1),(9,'Direito - Bacharelado',2),(10,'Fotografia - Curso Superior de Tecnologia',3),(11,'Jogos Digitais - Curso Superior de Tecnologia',3),(12,'Jornalismo - Bacharelado',3),(13,'Publicidade e Propaganda - Bacharelado',3),(14,'Ciências Biológicas - Licenciatura',4),(15,'Filosofia - Bacharelado',4),(16,'Filosofia - Licenciatura',4),(17,'Física - Licenciatura',4),(18,'História - Licenciatura',4),(19,'Letras Português e Espanhol - Licenciatura',4),(20,'Letras Português e Inglês - Licenciatura',4),(21,'Matemática - Licenciatura',4),(22,'Pedagogia - Licenciatura',4),(23,'Química- Licenciatura',4),(24,'Serviço Social - Bacharelado',4),(25,'Teologia - Bacharelado',4),(26,'Administração - Bacharelado',5),(27,'Ciências Contábeis - Bacharelado',5),(28,'Ciências Econômicas - Bacharelado',5),(29,'Ciências Políticas - Bacharelado',5),(30,'Ciências Biológicas - Bacharelado',6),(31,'Enfermagem - Bacharelado',6),(32,'Farmácia - Bacharelado',6),(33,'Fisioterapia - Bacharelado',6),(34,'Fonoaudiologia - Bacharelado',6),(35,'Medicina - Bacharelado',6),(36,'Nutrição - Bacharelado',6),(37,'Psicologia - Bacharelado',6);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamento` (
  `id` int NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (1,'ICAM-TECH'),(2,'CIÊNCIAS JURÍDICAS'),(3,'COMUNICAÇÃO'),(4,'EDUCAÇÃO E HUMANIDADES'),(5,'GESTÃO, ECONOMIA E POLÍTICA'),(6,'SAÚDE E CIÊNCIAS DA VIDA');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrada`
--

DROP TABLE IF EXISTS `entrada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entrada` (
  `placa` varchar(20) NOT NULL,
  `id_estacionamento` int NOT NULL,
  `date` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  KEY `placa_idx` (`placa`),
  KEY `id_estacion_idx` (`id_estacionamento`),
  CONSTRAINT `id_estacion` FOREIGN KEY (`id_estacionamento`) REFERENCES `estacionamento` (`id`),
  CONSTRAINT `placa` FOREIGN KEY (`placa`) REFERENCES `veiculo` (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada`
--

LOCK TABLES `entrada` WRITE;
/*!40000 ALTER TABLE `entrada` DISABLE KEYS */;
INSERT INTO `entrada` VALUES ('NFA-4942',1,'2021-06-08','11:45:52');
/*!40000 ALTER TABLE `entrada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estacionamento`
--

DROP TABLE IF EXISTS `estacionamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estacionamento` (
  `id` int NOT NULL,
  `qtd_vagas` int DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacionamento`
--

LOCK TABLES `estacionamento` WRITE;
/*!40000 ALTER TABLE `estacionamento` DISABLE KEYS */;
INSERT INTO `estacionamento` VALUES (1,200,'Bloco G'),(2,180,'Interno');
/*!40000 ALTER TABLE `estacionamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estacionamento_dep`
--

DROP TABLE IF EXISTS `estacionamento_dep`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estacionamento_dep` (
  `id_dep` int DEFAULT NULL,
  `id_esta` int DEFAULT NULL,
  KEY `id_depa_idx` (`id_dep`),
  KEY `id_esta_idx` (`id_esta`),
  CONSTRAINT `id_depa` FOREIGN KEY (`id_dep`) REFERENCES `departamento` (`id`),
  CONSTRAINT `id_esta` FOREIGN KEY (`id_esta`) REFERENCES `estacionamento` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacionamento_dep`
--

LOCK TABLES `estacionamento_dep` WRITE;
/*!40000 ALTER TABLE `estacionamento_dep` DISABLE KEYS */;
INSERT INTO `estacionamento_dep` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1);
/*!40000 ALTER TABLE `estacionamento_dep` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `matricula` varchar(12) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `sobrenome` varchar(255) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `numero_rua` varchar(10) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `fone1` varchar(45) DEFAULT NULL,
  `fone2` varchar(45) DEFAULT NULL,
  `placa_car` varchar(45) DEFAULT NULL,
  `id_dep` int DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  KEY `placa_carr_idx` (`placa_car`) /*!80000 INVISIBLE */,
  KEY `id_dep_idx` (`id_dep`),
  CONSTRAINT `id_dep` FOREIGN KEY (`id_dep`) REFERENCES `departamento` (`id`),
  CONSTRAINT `placa_carr` FOREIGN KEY (`placa_car`) REFERENCES `veiculo` (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES ('130270','Antônio','Oscar Cavalcanti da Fonte','M','Boa Viagem','269','902','Guarda','(87) 79288-1373','(56) 40272-6783','JTB-4819',4),('325320','Graziela','Brito de Almeida','F','Jordão','365','502','Professor','(41) 60209-4556','(60) 22081-9028','LQG-9193',2),('334500','Cezar','Augusto Cerqueira','M','Brasília Teimosa','586','801','Guarda','(38) 46779-4278','(28) 79076-6298','AFM-1378',1),('358010','Nilza','Simões Corrêa de Albuquerque','F','Ipsep','158','202','Professor','(47) 44381-4883','(22) 13600-4264','NDF-3836',1),('36999','Edvirges','Rodrigues Liberado Ruiz','F','Casa Forte','365','601','Recepcionista','(71) 20169-4240','(68) 32699-1779','NEB-5479',6),('377800','Zuleica','Dantas Pereira Campos','F','Boa Viagem','478','601','Professor','(61) 22276-8571','(23) 17223-8056','GYD-2827',5),('409190','José ','Elias Dubard de Moura Rocha','M','Boa Vista','364','302','Recepcionista','(45) 65316-1302','(68) 55207-3734','AWY-6805',5),('413620','Maria','Cecília Antunes de Aguiar','F','Encruzilhada','863','702','Professor','(29) 63730-8384','(58) 15532-6513','MOM-8023',3),('428700','Andréa','do Nascimento Dornelas Câmara','F','Imbiribeira','274','101','Professor','(69) 11086-7643','(24) 86202-2689','MOL-8277',2),('432310','Isabella','Leite Trindade','F','Boa Viagem','986','501','Professor','(30) 59495-4118','(19) 62769-9983','NAR-9591',1),('432400','Rita','di Cássia de Oliveira Ângelo','F','Encruzilhada','215','602','Secretaria','(13) 44308-1365','(18) 61006-9400','HZG-6535',5),('437320','Paula','Maria Wanderley Maciel do Rego Silva','F','Ibura','257','702','Professor','(81) 88016-1460','(70) 37622-8351','NAL-6496',6),('442840','Emanuela','Sousa Ribeiro','F','Jordão','965','102','Professor','(55) 33496-1583','(72) 30117-5281','KSJ-9875',3),('444620','Maria','de Lourdes Carneiro da Cunha Nóbrega','F','Cordeiro','541','401','Professor','(83) 66894-9428','(24) 17572-2966','MRD-0139',4),('81520','Ferdinand','Azevedo','M','Brasília Teimosa','456','302','Guarda','(37) 82815-2655','(87) 83975-7537','HEO-8257',4);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saida`
--

DROP TABLE IF EXISTS `saida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `saida` (
  `placa` varchar(20) DEFAULT NULL,
  `id_estacionamento` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  KEY `placa_c_idx` (`placa`),
  KEY `id_es_idx` (`id_estacionamento`),
  CONSTRAINT `id_es` FOREIGN KEY (`id_estacionamento`) REFERENCES `estacionamento` (`id`),
  CONSTRAINT `placa_c` FOREIGN KEY (`placa`) REFERENCES `veiculo` (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saida`
--

LOCK TABLES `saida` WRITE;
/*!40000 ALTER TABLE `saida` DISABLE KEYS */;
INSERT INTO `saida` VALUES ('NFA-4942',1,'2021-06-08','11:46:24');
/*!40000 ALTER TABLE `saida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `veiculo` (
  `placa` varchar(20) NOT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `cor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES ('AAN-6399','Towner Jr. Pick-up 1.0 8V 48cv  CS 2p','Dourado'),('ABV-1000','Esprit S-4 2.2 16V','Dourado'),('ADN-8022','VOYAGE Comfortline 1.0 T.Flex 12V 4p','Amarelo'),('AFM-1378','850 T-5 SW 2.5 BI-Turbo/ 2.3 Turbo','Amarelo'),('AKW-9712','Javali 3.0 4x4 Diesel','Laranja'),('AWY-6805','Carajas Diesel','Azul'),('BEZ-4215','Charade Sd 1.5/DLX 1.3','Azul'),('BJV-1545','156 Sport Wagon 2.0 16V','Dourado'),('DQK-3156','Freelander HSE3 2.5 V6 24V 177cv 3p','Cinza'),('EEN-3530','Buggy 2000W 1.6 8V','Bege'),('GYD-2827','Gran Voyager LE 2.5','Azul'),('GZG-8234','Impreza SD WRX 2.5 16V TB 4x4 4p','Vermelho'),('HEO-8257','T-4 DESERT STORM 4x4 3.0 TB Int Diesel','Preto'),('HPG-8326','fortwo passion cabrio 1.0 62kw/Tritop','Dourado'),('HPU-0885','Rodeo 3.2 V6','Preto'),('HQW-5883','LOGAN Dyna. EasyR Hi-Flex 1.6 8V Aut.','Amarelo'),('HRH-5779','Cargo CE 1.0 8V 53cv (Pick-Up)','Vermelho'),('HSW-1128','M5 5.0 32V/ 40V','Laranja'),('HYK-7933','Rexton II 3.2 V6 24V 220cv Aut.','Preto'),('HZG-6535','Musso GL 2.9 TB Diesel Int. 120cv','Preto'),('HZM-2121','Buggy 2000W 1.6 8V','Preto'),('HZN-9115','MG6 1.8 16V Turbo 170cv Aut.','Preto'),('HZS-0445','Tiggo 2.0 16V Aut. 5p','Bege'),('HZZ-8698','Cordoba SXE 1.8 / GLX 1.8 4p','Prata'),('IAD-2103','Accord Sed','Laranja'),('IAO-1085','Gran Voyager LE 2.5','Branco'),('JBT-9954','Carajas/ Tocantis/ Xavante/ Vip','Amarelo'),('JFZ-8605','CL-244 2.8 132cv 4x4 TB Int. Diesel','Bege'),('JQO-2586','Astra 2.0/ CD/ Sunny/ GLS 2.0 8V 3p','Laranja'),('JTB-4819','Buggy  Walk Sport 1.6 8V 58cv','Laranja'),('JUV-2095','Applause DLX 1.6 16V','Preto'),('JWA-9558','Towner Jr. Pick-up Ba','Laranja'),('JYR-9046','SY6390 A9 PVANS','Prata'),('KAO-7319','VKN VAN 2.0 16V 4p','Bege'),('KCA-2084','Sc','Laranja'),('KFN7727','T-4 4x4 3.0 TB Int. Cap. R','Azul'),('KGH3627','Buggy VII/VII BIG','Azul'),('KHA0182','Integra GS 1.8','Verde'),('KHG9445','Fiesta TITANIUM 1.6 16V Flex Mec.','Vermelho'),('KHN0527','L200 Triton OUTDOOR 2.4 Flex 16V CD Mec.','Azul'),('KHN9230','Lancer Evolut. IX MR 2.0 290cv TB-IC','Preto'),('KHW5535','430 2.0 V6','Cinza'),('KHW6338','AUMARK 3.5 - 11ST 2.8 4x2 TB Diesel','Marrom'),('KID4065','J6 2.0 JET Flex 5p Mec.','Amarelo'),('KJJ5910','207 XR Sport 1.4 Flex 8V 5p','Marrom'),('KJR1768','Buggy VII/VII BIG','Vermelho'),('KKC4696','Family 1.0 8V 53cv (Perua)','Cinza'),('KKD8102','Coupe FX 2.7 V6 24V 180cv Aut.','Dourado'),('KKE1021','T5 1.5 JET Flex 16V 5p Mec.','Dourado'),('KKF9344','Defender 90 Soft Top Diesel','Bege'),('KKK7195','Trans-AM 5.7 V8','Verde'),('KLB-7307','SANDERO Expres EasyR Hi-Flex 1.6 8V','Vermelho'),('KLB5700','AUMARK 3.5 - 11ST 2.8 4x2 TB Diesel','Laranja'),('KLF0977','Buggy 1.6 2-Lug.','Verde'),('KMA5377','Mini Cooper 1.3','Marrom'),('KMB9894','fortwo passion coup','Cinza'),('KSJ-9875','Towner Furg','Vermelho'),('KUQ-0110','Stark 2.3 4WD 127cv TDI Diesel 3p','Amarelo'),('LQG-9193','TT Roadster 1.8 TB QUATTRO 225cv (Conv.)','Preto'),('LSU-1264','SY6390 A9 CARGOV','Laranja'),('LVG-4013','LS-460L 4.6 V8 32v 347cv Aut.','Marrom'),('LWN-8696','F-Pace 3.0 S 380cv Aut.','Dourado'),('MGR-8435','SUV 2.2 4x4 (diesel) Mec.','Preto'),('MMO-9799','SCORPIO GLX SUV 2.6 TB Diesel CRDe 4WD','Marrom'),('MNH-3721','Buggy  Walk Sport 1.6 8V 58cv','Dourado'),('MNO-7194','HR-V EX 1.8 Flexone 16V 5p Aut.','Prata'),('MNP-8480','Hummer Wagon 6.5 4x4 Diesel TB','Laranja'),('MOL-8277','Stark 2.3 4WD 127cv TDI Diesel 3p','Laranja'),('MOM-8023','Way 1.8 Total Flex 8V Mec.','Cinza'),('MPR-0153','Vectra Comfort 2.0 MPFI','Bege'),('MPR-8953','Buggy 1.6 2-Lug.','Azul'),('MPZ-0549','fortwo coup','Azul'),('MQY-6031','Charade Sedan 1.3i 16V','Preto'),('MRD-0139','Picape BG-Truck CD Turbo Diesel','Verde'),('MSO-7495','HOVER CUV 2.4 16V 5p Mec.','Amarelo'),('MSW-9664','Korando 2.0 16V T.Diesel AWD Aut.','Verde'),('MVZ-2876','Ghibli S Q4 3.0 V6 410cv Aut.','Amarelo'),('MXE-3053','Way 1.6 Total Flex 8V Mec.','Laranja'),('MXU-7124','Clarus GLX 2.0 16V Mec','Azul'),('MXV-9650','GC2 1.0 12V 68cv 5p','Prata'),('MZO-7525','Space Wagon GLXi 2.4 ( Nova S','Laranja'),('MZQ-2355','QQ 1.1/1.0 12V 69cv 5p','Cinza'),('MZT-1329','AUMARK 3.5 - 11ST 2.8 4x2 TB Diesel','Dourado'),('MZT-2776','Quattroporte Automatica 4.2 32V 400cv','Vermelho'),('NAL-6496','Idea ESSENCE SUBLIME Dual.1.6 Flex16V 5p','Marrom'),('NAR-9591','Boxer 2.3 Minibus 15/16L TB Diesel.','Verde'),('NBQ-3263','MARRU','Cinza'),('NBY-7152','Buggy/M-8/M-8 Long 1.6','Prata'),('NDD-3379','fortwo BRABUS cabrio 1.0 72kw','Azul'),('NDF-3836','Freelander2 I6 S Sport 3.2 232cv Aut. 5p','Azul'),('NDZ-7430','Vantage Coupe 4.7 V8 425cv','Vermelho'),('NEB-5479','626 Sedan Mec.','Dourado'),('NEL-8303','NX-200t Luxury 2.0 16V 238cv Aut.','Dourado'),('NEW-5699','Impreza GL 4x4 1.8 16V','Preto'),('NFA-4942','Vitara JLX Canvas 1.6 8V 2p','Verde');
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projeto'
--

--
-- Dumping routines for database 'projeto'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-08 11:54:41
