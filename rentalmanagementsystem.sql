-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 03, 2022 at 08:36 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `complains`
--

CREATE TABLE `complains` (
  `complain_id` int(5) NOT NULL,
  `compl` text NOT NULL,
  `date` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `complains`
--

INSERT INTO `complains` (`complain_id`, `compl`, `date`) VALUES
(1, 'My shoes was stolen yesterday{Edward}', '2021-08-10 13:10:09.871087'),
(2, 'water has lost in my block', '2021-08-10 13:06:03.145039'),
(3, 'The sink has blocked ', '2021-08-10 13:06:38.687104'),
(4, 'No electricity in our block', '2021-08-10 13:06:56.949164'),
(5, 'No imternet connection Regards John Room 4', '2021-08-23 05:05:45.103829'),
(6, 'no dustibin pit', '2021-08-15 18:39:22.462947'),
(7, '', '2021-08-18 18:25:34.608968'),
(8, 'stealing', '2021-08-18 20:45:28.388834');

-- --------------------------------------------------------

--
-- Table structure for table `countries`
--

CREATE TABLE `countries` (
  `COUNTRY_ID` varchar(2) NOT NULL,
  `COUNTRY_NAME` varchar(40) NOT NULL,
  `REGION_ID` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `employee_id` int(5) NOT NULL,
  `firstname` text NOT NULL,
  `lastname` text NOT NULL,
  `phonenumber` int(10) NOT NULL,
  `worktype` text NOT NULL,
  `salary` int(5) NOT NULL,
  `Date_employed` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`employee_id`, `firstname`, `lastname`, `phonenumber`, `worktype`, `salary`, `Date_employed`) VALUES
(1, 'mike', 'kimathi', 7983478, 'cleaning', 4509, '12 - 07 - 2021'),
(2, 'Mike', 'kinuthia', 712345098, 'Security Guard', 12000, '03-08-2021'),
(5, 'faraday', 'mkuuz', 712211221, 'CareTaker', 6700, '02-08-2021');

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

CREATE TABLE `expenses` (
  `id` int(5) NOT NULL,
  `electricity` int(6) NOT NULL,
  `water` int(6) NOT NULL,
  `others` int(6) NOT NULL,
  `month` varchar(50) NOT NULL,
  `daterecorded` timestamp(5) NOT NULL DEFAULT CURRENT_TIMESTAMP(5) ON UPDATE CURRENT_TIMESTAMP(5)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`id`, `electricity`, `water`, `others`, `month`, `daterecorded`) VALUES
(1, 200, 400, 100, 'January', '0000-00-00 00:00:00.00000');

-- --------------------------------------------------------

--
-- Table structure for table `notices`
--

CREATE TABLE `notices` (
  `notice_id` int(5) NOT NULL,
  `notice` text NOT NULL,
  `date_recorded` timestamp(4) NOT NULL DEFAULT CURRENT_TIMESTAMP(4) ON UPDATE CURRENT_TIMESTAMP(4)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notices`
--

INSERT INTO `notices` (`notice_id`, `notice`, `date_recorded`) VALUES
(1, 'We have worked on you last week request based on sink blocking and insecurity we will check on that', '2021-08-22 05:48:51.7040'),
(2, 'please pay ur rent on time', '2021-08-22 12:37:21.3823'),
(3, 'Hello Members i have seen complain about security issues am acting on it to ensure your safety', '2021-08-23 04:48:58.3018'),
(4, 'Am working towards power lost', '2021-08-23 05:09:42.0008');

-- --------------------------------------------------------

--
-- Table structure for table `rent`
--

CREATE TABLE `rent` (
  `rent_id` int(5) NOT NULL,
  `phonenumber` int(10) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `roomnumber` int(5) NOT NULL,
  `amount_paid` int(4) NOT NULL,
  `arrears` int(4) NOT NULL,
  `Monthpaid` varchar(50) NOT NULL,
  `date_paid` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rent`
--

INSERT INTO `rent` (`rent_id`, `phonenumber`, `firstname`, `lastname`, `roomnumber`, `amount_paid`, `arrears`, `Monthpaid`, `date_paid`) VALUES
(1, 720055645, 'mike', 'Faraday', 1, 3000, 200, 'January', '0000-00-00 00:00:00.000000'),
(2, 712345678, 'evans', 'muchai', 2, 3000, 200, 'January', '0000-00-00 00:00:00.000000');

-- --------------------------------------------------------

--
-- Table structure for table `rental_properties`
--

CREATE TABLE `rental_properties` (
  `property_id` int(5) NOT NULL,
  `name` text NOT NULL,
  `quantity` int(3) NOT NULL,
  `price` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rental_properties`
--

INSERT INTO `rental_properties` (`property_id`, `name`, `quantity`, `price`) VALUES
(1, 'brooms', 6, 2900);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `room_number` int(10) NOT NULL,
  `room_type` varchar(50) NOT NULL,
  `block_number` int(5) NOT NULL,
  `status` varchar(50) NOT NULL,
  `phonenumber` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rules_regulations`
--

CREATE TABLE `rules_regulations` (
  `id` int(5) NOT NULL,
  `rules` text NOT NULL,
  `duedates` text NOT NULL,
  `date` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rules_regulations`
--

INSERT INTO `rules_regulations` (`id`, `rules`, `duedates`, `date`) VALUES
(1, '*****************************************\r\n           RULES AND REGULATIONS \r\n*****************************************\r\nRules\r\n1. Pay Rent on Time\r\n2. Respect all workers and One Another.\r\n3. Keep your assets secure.\n4.Ensure Cleanliness all Time', '*************************************\r\n           PAYMENTS AND DUE DATES  \r\n*************************************\r\nhello Esteemed Memebers,\r\nrent Due Dates is 23/11/2020\r\nmode of Payment:\r\nKCB: 122123444\r\nEquity: 1454333\r\nNB\r\n1. When you pay rent send me the phonenumber you registered with in tenants details,\r\n mode of payment and transaction id.\r\n2. No cash Payment is Allowed Strictly follow the above mode of payments\r.\n\r\n', '2021-08-23 05:23:41.520943');

-- --------------------------------------------------------

--
-- Table structure for table `service_providers`
--

CREATE TABLE `service_providers` (
  `id` int(5) NOT NULL,
  `company_name` text NOT NULL,
  `contacts` int(10) NOT NULL,
  `service_type` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service_providers`
--

INSERT INTO `service_providers` (`id`, `company_name`, `contacts`, `service_type`, `address`) VALUES
(1, 'mawingus', 71233495, 'wireless network', '12 kijambes'),
(2, 'mikylimited', 154365487, 'WIFI', '76 thika');

-- --------------------------------------------------------

--
-- Table structure for table `tenants`
--

CREATE TABLE `tenants` (
  `tenant_id` int(5) NOT NULL,
  `firstname` text NOT NULL,
  `lastname` text NOT NULL,
  `phonenumber` int(10) NOT NULL,
  `occupation_type` varchar(50) NOT NULL,
  `roomnumber` int(5) NOT NULL,
  `Registrationdate` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tenants`
--

INSERT INTO `tenants` (`tenant_id`, `firstname`, `lastname`, `phonenumber`, `occupation_type`, `roomnumber`, `Registrationdate`) VALUES
(2, 'evans', 'muchai', 712345678, 'Non Student', 2, '2021-08-23 16:47:36.662369'),
(1, 'mike', 'faraday', 720055645, 'Non Student', 1, '2021-08-23 16:45:20.067936');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(100) NOT NULL,
  `username` varchar(20) NOT NULL,
  `PhoneNumber` int(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `confirm_password` varchar(20) NOT NULL,
  `role` varchar(50) DEFAULT NULL,
  `SecurityQuestion` varchar(100) NOT NULL,
  `Answer` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `PhoneNumber`, `password`, `confirm_password`, `role`, `SecurityQuestion`, `Answer`) VALUES
(1, 'jackie', 712345677, 'shikujm', 'shikujm', 'Admin', 'What is your Favorite Pet?', 'Cat'),
(2, 'miky', 797627661, 'farady592', 'farady592', 'Tenant', 'What is your Favorite Dish?', 'pizza'),
(3, 'dennoh', 112233445, '123456', '123456', NULL, 'What is your Favorite Dish?', 'chipo'),
(4, 'cate', 112233000, '9090', '9090', 'Tenant', 'What is your Favorite Pet?', 'dog'),
(5, 'mutu', 99887766, '1212', '1212', 'Tenant', 'What is your Favorite Pet?', 'cat'),
(6, 'christine', 713604034, 'wangui', 'wangui', 'Tenant', 'What is your Favorite Dish?', 'rice'),
(7, 'simoh', 703098765, 'sim12', 'sim12', 'CareTaker', 'What is your Favorite Dream Country?', 'U.S.A'),
(8, 'winne', 789345876, 'popster', 'popster', 'Tenant', 'What is your Favorite Dream Country?', 'us'),
(10, 'kim', 1234567890, 'kimsy', 'kimsy', 'Tenant', 'What is your Favorite Dish?', 'ugali');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complains`
--
ALTER TABLE `complains`
  ADD PRIMARY KEY (`complain_id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`employee_id`),
  ADD UNIQUE KEY `phonenumber` (`phonenumber`);

--
-- Indexes for table `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `notices`
--
ALTER TABLE `notices`
  ADD PRIMARY KEY (`notice_id`);

--
-- Indexes for table `rent`
--
ALTER TABLE `rent`
  ADD PRIMARY KEY (`rent_id`,`phonenumber`);

--
-- Indexes for table `rental_properties`
--
ALTER TABLE `rental_properties`
  ADD PRIMARY KEY (`property_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_number`);

--
-- Indexes for table `rules_regulations`
--
ALTER TABLE `rules_regulations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `service_providers`
--
ALTER TABLE `service_providers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `contacts` (`contacts`);

--
-- Indexes for table `tenants`
--
ALTER TABLE `tenants`
  ADD PRIMARY KEY (`phonenumber`),
  ADD UNIQUE KEY `tenant_id` (`tenant_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `PhoneNumber` (`PhoneNumber`),
  ADD UNIQUE KEY `password` (`password`,`confirm_password`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `complains`
--
ALTER TABLE `complains`
  MODIFY `complain_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `employee_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `expenses`
--
ALTER TABLE `expenses`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `notices`
--
ALTER TABLE `notices`
  MODIFY `notice_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `rent`
--
ALTER TABLE `rent`
  MODIFY `rent_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `rental_properties`
--
ALTER TABLE `rental_properties`
  MODIFY `property_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `room_number` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rules_regulations`
--
ALTER TABLE `rules_regulations`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `service_providers`
--
ALTER TABLE `service_providers`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tenants`
--
ALTER TABLE `tenants`
  MODIFY `tenant_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
