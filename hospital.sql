-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2019 at 12:09 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `lname` varchar(30) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `hospital` varchar(30) NOT NULL,
  `physician` varchar(30) NOT NULL,
  `mob` varchar(12) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(30) NOT NULL,
  `state` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `problum` varchar(50) NOT NULL,
  `appoint_reg` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`id`, `fname`, `lname`, `gender`, `hospital`, `physician`, `mob`, `email`, `address`, `city`, `state`, `country`, `problum`, `appoint_reg`) VALUES
(26, 'ANKIT', 'DFFXX', 'Male', 'Male', 'Married', '12/0', 'dfd', 'XZCVXC', 'XXC', 'Cardiology', '1', '', 'AP-5741'),
(27, 'fsf', 'sfsf', 'Female', 'dfsff', 'sfs', 'fsdf', 'ff', 'fdsf', 'fdsd', 'fsdsdf', 'dfs', 'fsdsd', 'AP-9238'),
(28, 'gdf', 'ffffff', 'Female', 'fddf', 'df', 'ggd', 'fdgf', 'gf', 'ddgd', 'gdf', 'dfg', 'fdg', 'AP-4612'),
(29, 'gdf', 'ffffff', 'Female', 'fddf', 'df', 'ggd', 'fdgf', 'gf', 'ddgd', 'gdf', 'dfg', 'fdg', 'AP-4612'),
(32, 'dfgs', 'sgss', 'Female', 'sgss', 'gsd', 'sdg', 'sdg', 'sggs', 'sgs', 'gsggs', 'sg', 'sdg', 'AP-6321'),
(33, 'dfgs', 'sgss', 'Female', 'sgss', 'gsd', 'sdg', 'sdg', 'sggs', 'sgs', 'gsggs', 'sg', 'sdg', 'AP-6321'),
(35, 'vxds', 'sss', 'Female', 'sdd', 'cc', 'xcxcz', 'zxzc', 'zxzz', 'zczx', 'zczcz', 'zxxzcz', 'zcz', 'AP-7294');

-- --------------------------------------------------------

--
-- Table structure for table `docter`
--

CREATE TABLE `docter` (
  `id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Joiningdate` varchar(30) NOT NULL,
  `Phoneno` varchar(30) NOT NULL,
  `Emailid` varchar(30) NOT NULL,
  `Specialitytype` varchar(30) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `Yearsofexperience` varchar(30) NOT NULL,
  `Medicaldegree` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patient_id` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Father` varchar(30) NOT NULL,
  `Mother` varchar(30) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `MaritalStatus` varchar(30) NOT NULL,
  `CheckinDate` varchar(30) NOT NULL,
  `CheckinTIme` varchar(30) NOT NULL,
  `FamilyDocter` varchar(30) NOT NULL,
  `FamilyDocterMob` varchar(30) NOT NULL,
  `ProblumCateog.` varchar(50) NOT NULL,
  `PatientRoom` varchar(30) NOT NULL,
  `Roomno.` varchar(30) NOT NULL,
  `PreferDoc` varchar(30) NOT NULL,
  `patientStatus` varchar(30) NOT NULL,
  `Phone` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `Distric` varchar(30) NOT NULL,
  `State` varchar(30) NOT NULL,
  `Country` varchar(30) NOT NULL,
  `PinCode` varchar(30) NOT NULL,
  `patient_reg` varchar(50) NOT NULL,
  `Medicine_Name` varchar(50) NOT NULL,
  `Medicine_quantity` varchar(50) NOT NULL,
  `injection_Name` varchar(30) NOT NULL,
  `injection_quantity` varchar(30) NOT NULL,
  `testname` varchar(30) NOT NULL,
  `status` varchar(30) NOT NULL,
  `Appicationcharge` varchar(30) NOT NULL,
  `Doctercharge` varchar(30) NOT NULL,
  `Medicinecharge` varchar(30) NOT NULL,
  `Testcharge` varchar(30) NOT NULL,
  `Roomcharge` varchar(30) NOT NULL,
  `Extracharge` varchar(30) NOT NULL,
  `totalcharge` varchar(30) NOT NULL,
  `Statuspayment` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `Name`, `Father`, `Mother`, `Gender`, `MaritalStatus`, `CheckinDate`, `CheckinTIme`, `FamilyDocter`, `FamilyDocterMob`, `ProblumCateog.`, `PatientRoom`, `Roomno.`, `PreferDoc`, `patientStatus`, `Phone`, `Email`, `Address`, `Distric`, `State`, `Country`, `PinCode`, `patient_reg`, `Medicine_Name`, `Medicine_quantity`, `injection_Name`, `injection_quantity`, `testname`, `status`, `Appicationcharge`, `Doctercharge`, `Medicinecharge`, `Testcharge`, `Roomcharge`, `Extracharge`, `totalcharge`, `Statuspayment`) VALUES
(7, 'ABC', 'SDD', 'DSA', 'Female', 'Married', 'ADSD', 'DSAD', 'ASD', 'SD', 'Cardiothoracic', ' Two-Bedded Room	', '3', 'AS', 'Critical but stable', 'ASASA', 'DS', 'SDA', 'DASD', 'Assam ', 'Albania', 'ADSA', 'HP-320', '', '0', '', '0', '', '', '', '', '', '', '', '', '', ''),
(26, 'ANKIT', 'DFFXX', 'SDFF', 'Male', 'Married', '12/0', '', 'XZCVXC', 'XXC', 'Cardiology', 'VIP Suite', '1', 'CXVC', 'Critical', 'BFGHF', 'CVVC', 'BC', 'CVXCV', 'Uttar Pradesh ', 'India', '', 'HP-6789', '', '0', '', '0', '', '', '', '', '', '', '', '', '', ''),
(27, 'VIVEK', 'FF', 'F', 'Male', 'Single', 'FDSFF', 'SDFS', 'SDS', 'DF', 'Cardiothoracic', ' Two-Bedded Room	', '3', 'XXXX', 'Serious', 'GFGG', 'VIVEK496PANDEY@GMAIL.COM', 'FGDGD', 'DFGDG', 'Assam ', 'Albania', '244', 'HP-742', 'vxvx', '2', 'xvcv', '2', 'vc', '10-30% GOOD', '1', '1', '1', '1', '1', '1', '1', 'Succesfull'),
(28, 'dgfdgd', 'gdfgd', 'dfggdfg', 'fgdgdg', 'dg', 'dgdf', 'gfgdg', 'dgd', 'dg', 'gdfgd', 'dg', 'gdfg', '', '', '', '', '', '', '', '', '', '', '', '0', '', '0', '', '', '', '', '', '', '', '', '', ''),
(29, '', 'gdg', 'dfgg', 'dfg', 'dgdg', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0', '', '0', '', '', '', '', '', '', '', '', '', ''),
(30, 'fgdg', 'dgdf', 'gddfg', 'Female', 'Married', 'fdsfs', 'sdfs', 'fsf', 'sdf', 'Cardiothoracic', ' Two-Bedded Room	', '3', 'sfsd', 'Serious', 'sdsf', 'fsfsd', 'fsdfs', 'sf', 'Assam ', 'Albania', 'sfsdfs', 'HP-3433', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?'),
(31, 'raj', 'karan', 'kiran', 'Male', 'Married', '12/3/1998', '12:12pm', 'mohit', '54444454', 'Cardiology', ' Single Deluxe Room	 ', '2', 'suraj kumar', 'Serious', '4544464654', 'raj@gmail.com', 'kanpur', 'kanpur', 'Uttar Pradesh ', 'India', '123434', 'HP-8183', 'cobadex', '2', 'oxytatracycline ', '3', 'blood test ', '40-70% GOOD', '100', '1200', '700', '200', '1000', '800', '1000', 'Succesfull');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `usertype` varchar(20) NOT NULL,
  `user_reg` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `usertype`, `user_reg`) VALUES
(9, 'vivek', '12345', 'User', ''),
(10, 'vivek', '123', 'Admin', ''),
(14, 'miraj', '123', 'User', 'HS-3210');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `docter`
--
ALTER TABLE `docter`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointment`
--
ALTER TABLE `appointment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `docter`
--
ALTER TABLE `docter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `docter`
--
ALTER TABLE `docter`
  ADD CONSTRAINT `docter_ibfk_1` FOREIGN KEY (`id`) REFERENCES `patient` (`patient_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
