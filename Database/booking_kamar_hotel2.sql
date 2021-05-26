-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 09, 2021 at 08:22 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `booking_kamar_hotel2`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookinghotel`
--

CREATE TABLE `bookinghotel` (
  `kode` int(50) NOT NULL,
  `jenisKamar` varchar(30) NOT NULL,
  `harga` varchar(30) NOT NULL,
  `namaCustomer` varchar(30) NOT NULL,
  `tglCheckIn` varchar(30) NOT NULL,
  `tglCheckOut` varchar(30) NOT NULL,
  `noHp` varchar(30) NOT NULL,
  `status` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookinghotel`
--

INSERT INTO `bookinghotel` (`kode`, `jenisKamar`, `harga`, `namaCustomer`, `tglCheckIn`, `tglCheckOut`, `noHp`, `status`, `alamat`) VALUES
(1, 'DELUXE', '200000', 'Mr. Evan Sianipar', '2021-03-07', '2021-03-10', '082294392617', 'Belum Menikah', 'Pematangsiantar'),
(2, 'DELUXE', '200000', 'Mrs. Romaulis Sianipar', '2021-03-18', '2021-03-25', '082298785567', 'Belum Menikah', 'Balige'),
(3, 'DELUXE ROOM ONLY', '150000', 'Mr. Daud Manurung', '2021-03-07', '2021-03-10', '08976766666', 'Belum Menikah', 'Medan'),
(4, 'DELUXE ROOM ONLY', '150000', 'Mrs. Nasrani Sitorus', '2021-03-08', '2021-03-12', '082989182989', 'Belum Menikah', 'Porsea'),
(5, 'DELUXE ROOM ONLY', '150000', 'Mr. Pahala', '2021-03-10', '2021-03-22', '082294396271', 'Belum Menikah', 'Medan');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `firstname` varchar(10) NOT NULL,
  `lastname` varchar(12) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `firstname`, `lastname`, `email`, `password`) VALUES
(1, 'evan', 'sianipar', 'evan@gmail.com', '123456'),
(2, 'roma', 'uli', 'roma@gmail.com', '12345678'),
(3, 'roma', 'uli', 'roma@gmail.com', '12345678'),
(4, 'roma', 'uli', 'roma@gmail.com', '12345678'),
(5, 'Daud', 'Manurung', 'daud@gmail.com', '123456'),
(6, 'Ester', 'H', 'ester@gmail.com', '123456'),
(7, 'Sonya', 'Siaphutar', 'sonya@gmail.com', 'sonya1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookinghotel`
--
ALTER TABLE `bookinghotel`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
