-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Nov 21, 2018 at 05:37 AM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `tm_attendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `location` varchar(100) NOT NULL,
  `time` text NOT NULL,
  `std_block_course_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `date`, `location`, `time`, `std_block_course_id`) VALUES
(1, '2018-11-19', 'DALBY', 'AM', 1),
(2, '2018-11-20', 'DALBY', 'AM', 1),
(3, '2018-11-21', 'DALBY', 'AM', 1),
(4, '2018-11-22', 'DALBY', 'AM', 1),
(5, '2018-11-24', 'DALBY', 'AM', 1),
(6, '2018-11-23', 'DALBY', 'AM', 1),
(7, '2018-11-26', 'DALBY', 'AM', 1),
(8, '2018-11-27', 'DALBY', 'AM', 1),
(9, '2018-11-19', 'MENS', 'AFT', 2),
(10, '2018-11-20', 'MENS', 'AFT', 2),
(11, '2018-11-21', 'MENS', 'AFT', 2);

-- --------------------------------------------------------

--
-- Table structure for table `block`
--

CREATE TABLE `block` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `added_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `block`
--

INSERT INTO `block` (`id`, `name`, `start_date`, `end_date`, `added_at`) VALUES
(1, 'DEC18', '2018-11-19', '2018-12-13', '2018-11-20 21:42:40'),
(2, 'NOV18', '2018-10-19', '2018-11-13', '2018-11-20 21:43:06');

-- --------------------------------------------------------

--
-- Table structure for table `block_course_professor`
--

CREATE TABLE `block_course_professor` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `block_course_student`
--

CREATE TABLE `block_course_student` (
  `id` bigint(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `block_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `block_course_student`
--

INSERT INTO `block_course_student` (`id`, `course_id`, `student_id`, `block_id`) VALUES
(1, 1, 2, 1),
(2, 2, 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `course_id` varchar(100) NOT NULL,
  `title` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `course_id`, `title`, `created_at`) VALUES
(1, 'CS455', 'Programming Language', '2018-11-20 21:45:33'),
(2, 'CS545', 'WMA', '2018-11-20 21:45:33');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` text NOT NULL,
  `user_role` varchar(100) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `student_id` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `user_role`, `last_name`, `first_name`, `student_id`) VALUES
(1, 'admin@mum.edu', 'admin@mum.edu', 'ADMIN', 'ADMIN', 'USER', ''),
(2, 'student@mum.edu', 'student@mum.edu', 'STUDENT', 'Maryo', 'Jo', ''),
(3, 'professor@mum.edu', 'professor@mum.edu', 'PROFESSOR', 'ManO', 'JAN', ''),
(4, 'student1@mum.edu', 'student1@mum.edu', 'STUDENT', 'JAPI', 'Gip', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `block`
--
ALTER TABLE `block`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `block_course_professor`
--
ALTER TABLE `block_course_professor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `block_course_student`
--
ALTER TABLE `block_course_student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `block`
--
ALTER TABLE `block`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `block_course_professor`
--
ALTER TABLE `block_course_professor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `block_course_student`
--
ALTER TABLE `block_course_student`
  MODIFY `id` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
