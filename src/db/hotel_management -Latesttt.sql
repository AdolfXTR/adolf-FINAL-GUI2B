-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2025 at 06:28 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `booked_rooms`
--

CREATE TABLE `booked_rooms` (
  `booking_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `check_in_date` date DEFAULT NULL,
  `check_out_date` date DEFAULT NULL,
  `num_guests` int(11) DEFAULT NULL,
  `special_requests` text DEFAULT NULL,
  `booking_status` varchar(20) DEFAULT 'pending',
  `expiration_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booked_rooms`
--

INSERT INTO `booked_rooms` (`booking_id`, `room_id`, `user_id`, `check_in_date`, `check_out_date`, `num_guests`, `special_requests`, `booking_status`, `expiration_date`) VALUES
(1, 1, 16, '2025-05-19', '2025-05-24', 4, 'None', 'pending', '2025-05-28 15:12:55'),
(2, 2, 16, '2025-05-20', '2025-05-24', 6, 'None', 'approved', '2025-05-28 15:12:55'),
(3, 22, 16, '2025-05-21', '2025-05-22', 5, 'None', 'pending', '2025-05-28 15:12:55'),
(4, 13, 19, '2025-05-28', '2025-05-30', 6, 'None', 'pending', '2025-05-28 15:12:55'),
(5, 15, 18, '2025-05-28', '2025-05-31', 3, 'None', 'approved', '2025-05-28 15:38:28');

-- --------------------------------------------------------

--
-- Table structure for table `function_logs`
--

CREATE TABLE `function_logs` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `function_name` varchar(255) DEFAULT NULL,
  `log_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `function_logs`
--

INSERT INTO `function_logs` (`id`, `user_id`, `function_name`, `log_time`) VALUES
(1, NULL, 'Admin updated user with ID: 14', '2025-05-01 13:02:23'),
(3, NULL, 'administrator logged in successfully', '2025-05-01 14:13:44'),
(4, NULL, 'administrator logged in successfully', '2025-05-01 14:15:18'),
(5, NULL, 'administrator logged in successfully', '2025-05-01 14:20:20'),
(6, NULL, 'administrator logged in successfully', '2025-05-01 14:21:00'),
(7, NULL, 'administrator logged in successfully', '2025-05-01 14:22:45'),
(8, NULL, 'administrator logged in successfully', '2025-05-01 14:24:09'),
(9, NULL, 'administrator logged in successfully', '2025-05-01 14:26:10'),
(10, NULL, 'test123 logged in successfully', '2025-05-01 14:31:49'),
(11, NULL, 'Admin updated user with ID: 15', '2025-05-01 14:32:04'),
(12, NULL, 'Admin updated user with ID: 15', '2025-05-01 14:32:10'),
(13, NULL, 'administrator logged in successfully', '2025-05-16 16:28:23'),
(14, NULL, 'administrator logged in successfully', '2025-05-16 17:05:23'),
(15, NULL, 'administrator logged in successfully', '2025-05-16 18:08:41'),
(16, NULL, 'administrator logged in successfully', '2025-05-16 18:12:24'),
(17, NULL, 'administrator logged in successfully', '2025-05-16 18:14:44'),
(18, NULL, 'administrator logged in successfully', '2025-05-16 18:15:31'),
(19, NULL, 'administrator logged in successfully', '2025-05-16 18:17:51'),
(20, NULL, 'administrator logged in successfully', '2025-05-16 18:19:50'),
(21, NULL, 'user logged in successfully', '2025-05-16 18:43:26'),
(22, NULL, 'user logged in successfully', '2025-05-16 18:48:54'),
(23, NULL, 'user logged in successfully', '2025-05-16 19:02:00'),
(24, NULL, 'user logged in successfully', '2025-05-16 19:02:49'),
(25, NULL, 'user logged in successfully', '2025-05-16 19:12:17'),
(26, NULL, 'administrator logged in successfully', '2025-05-16 19:23:02'),
(27, NULL, 'administrator logged in successfully', '2025-05-16 19:24:01'),
(28, NULL, 'administrator logged in successfully', '2025-05-16 19:25:40'),
(29, NULL, 'user logged in successfully', '2025-05-16 19:32:30'),
(30, NULL, 'administrator logged in successfully', '2025-05-16 19:48:03'),
(31, NULL, 'administrator logged in successfully', '2025-05-16 19:52:26'),
(32, NULL, 'administrator logged in successfully', '2025-05-17 01:10:16'),
(33, NULL, 'administrator logged in successfully', '2025-05-17 01:11:00'),
(34, NULL, 'user logged in successfully', '2025-05-17 01:11:16'),
(35, NULL, 'test123456 logged in successfully', '2025-05-17 01:46:29'),
(36, NULL, 'administrator logged in successfully', '2025-05-17 01:49:00'),
(37, NULL, 'user logged in successfully', '2025-05-19 14:05:51'),
(38, NULL, 'administrator logged in successfully', '2025-05-19 14:49:25'),
(39, NULL, 'user logged in successfully', '2025-05-19 14:50:07'),
(40, NULL, 'user logged in successfully', '2025-05-19 14:51:26'),
(41, NULL, 'administrator logged in successfully', '2025-05-19 15:25:12'),
(42, NULL, 'user logged in successfully', '2025-05-19 15:25:38'),
(43, NULL, 'administrator logged in successfully', '2025-05-19 15:25:53'),
(44, NULL, 'user logged in successfully', '2025-05-19 15:26:19'),
(45, NULL, 'administrator logged in successfully', '2025-05-19 15:29:44'),
(46, NULL, 'user logged in successfully', '2025-05-19 15:29:54'),
(47, NULL, 'user logged in successfully', '2025-05-19 15:35:13'),
(48, NULL, 'user logged in successfully', '2025-05-19 15:39:22'),
(49, NULL, 'administrator logged in successfully', '2025-05-19 15:50:27'),
(50, NULL, 'administrator logged in successfully', '2025-05-19 16:05:29'),
(51, NULL, 'user logged in successfully', '2025-05-19 16:19:05'),
(52, NULL, 'administrator logged in successfully', '2025-05-19 16:35:19'),
(53, NULL, 'user logged in successfully', '2025-05-19 17:34:52'),
(54, NULL, 'user logged in successfully', '2025-05-19 17:38:43'),
(55, NULL, 'user logged in successfully', '2025-05-20 15:45:36'),
(56, NULL, 'administrator logged in successfully', '2025-05-20 15:46:28'),
(57, NULL, 'user logged in successfully', '2025-05-20 16:00:03'),
(58, NULL, 'user logged in successfully', '2025-05-20 16:00:26'),
(59, NULL, 'user logged in successfully', '2025-05-20 16:04:33'),
(60, NULL, 'administrator logged in successfully', '2025-05-20 16:05:42'),
(61, NULL, 'administrator logged in successfully', '2025-05-20 16:13:23'),
(62, NULL, 'administrator logged in successfully', '2025-05-20 16:28:43'),
(63, NULL, 'administrator logged in successfully', '2025-05-20 16:32:04'),
(64, NULL, 'administrator logged in successfully', '2025-05-20 16:35:59'),
(65, NULL, 'user logged in successfully', '2025-05-20 16:36:48'),
(66, NULL, 'user logged in successfully', '2025-05-20 16:43:23'),
(67, NULL, 'administrator logged in successfully', '2025-05-20 16:44:15'),
(68, NULL, 'user logged in successfully', '2025-05-20 16:46:07'),
(69, NULL, 'administrator logged in successfully', '2025-05-20 16:46:14'),
(70, NULL, 'administrator logged in successfully', '2025-05-20 16:47:41'),
(71, NULL, 'user logged in successfully', '2025-05-20 16:52:18'),
(72, NULL, 'administrator logged in successfully', '2025-05-20 16:52:28'),
(73, NULL, 'administrator logged in successfully', '2025-05-20 16:55:13'),
(74, NULL, 'Assistant logged in successfully', '2025-05-20 17:03:15'),
(75, NULL, 'Assistant logged in successfully', '2025-05-20 17:08:27'),
(76, NULL, 'administrator logged in successfully', '2025-05-20 17:11:08'),
(77, NULL, 'administrator logged in successfully', '2025-05-20 17:13:18'),
(78, NULL, 'Assistant logged in successfully', '2025-05-20 17:13:46'),
(79, NULL, 'administrator logged in successfully', '2025-05-20 17:16:11'),
(80, NULL, 'Assistant logged in successfully', '2025-05-20 17:16:36'),
(81, NULL, 'Assistant logged in successfully', '2025-05-20 17:17:39'),
(82, NULL, 'user logged in successfully', '2025-05-21 00:03:41'),
(83, NULL, 'user logged in successfully', '2025-05-21 00:03:46'),
(84, NULL, 'user logged in successfully', '2025-05-21 00:03:48'),
(85, NULL, 'administrator logged in successfully', '2025-05-21 00:03:57'),
(86, NULL, 'user logged in successfully', '2025-05-21 00:05:31'),
(87, NULL, 'user logged in successfully', '2025-05-21 00:07:23'),
(88, NULL, 'user logged in successfully', '2025-05-21 00:09:00'),
(89, NULL, 'user logged in successfully', '2025-05-21 00:09:29'),
(90, NULL, 'user logged in successfully', '2025-05-21 00:25:26'),
(91, NULL, 'administrator logged in successfully', '2025-05-21 00:29:47'),
(92, NULL, 'administrator logged in successfully', '2025-05-21 00:31:24'),
(93, NULL, 'administrator logged in successfully', '2025-05-21 00:32:22'),
(94, NULL, 'administrator logged in successfully', '2025-05-21 00:32:57'),
(95, NULL, 'adolf123 logged in successfully', '2025-05-22 03:43:26'),
(96, NULL, 'adolf123 logged in successfully', '2025-05-22 03:44:43'),
(97, NULL, 'adolf123 logged in successfully', '2025-05-22 03:48:24'),
(98, NULL, 'User changed their passworduser', '2025-05-22 03:51:58'),
(99, NULL, 'adolf123 logged in successfully', '2025-05-22 05:16:34'),
(100, NULL, 'Admin updated user with ID: 19', '2025-05-22 05:17:00'),
(101, NULL, 'Admin updated user with ID: 16', '2025-05-22 05:17:27'),
(102, NULL, 'User changed their passwordadolf123', '2025-05-28 14:54:20'),
(103, NULL, 'adolf123 logged in successfully', '2025-05-28 14:54:30'),
(104, NULL, 'adolf123 logged in successfully', '2025-05-28 14:54:39'),
(105, NULL, 'adolf123 logged in successfully', '2025-05-28 14:54:42'),
(106, NULL, 'adolf123 logged in successfully', '2025-05-28 14:55:20'),
(107, NULL, 'adolf123 logged in successfully', '2025-05-28 14:56:36'),
(108, NULL, 'adolf123 logged in successfully', '2025-05-28 14:56:56'),
(109, NULL, 'adolf123 logged in successfully', '2025-05-28 15:03:46'),
(110, NULL, 'User changed their passwordalcaya123', '2025-05-28 15:33:39'),
(111, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:33:51'),
(112, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:37:04'),
(113, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:41:00'),
(114, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:41:41'),
(115, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:43:42'),
(116, NULL, 'adolf123 logged in successfully', '2025-05-28 15:44:10'),
(117, NULL, 'adolf123 logged in successfully', '2025-05-28 15:44:36'),
(118, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:45:28'),
(119, NULL, 'alcaya123 logged in successfully', '2025-05-28 15:55:17'),
(120, NULL, 'alcaya123 logged in successfully', '2025-05-28 16:01:04'),
(121, NULL, 'alcaya123 logged in successfully', '2025-05-28 16:20:57'),
(122, NULL, 'alcaya123 logged in successfully', '2025-05-28 16:24:07');

-- --------------------------------------------------------

--
-- Table structure for table `hotels`
--

CREATE TABLE `hotels` (
  `hotel_id` int(11) NOT NULL,
  `hotel_name` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) DEFAULT NULL,
  `zip_code` varchar(10) DEFAULT NULL,
  `country` varchar(50) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `star_rating` decimal(2,1) DEFAULT NULL,
  `description` text DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hotels`
--

INSERT INTO `hotels` (`hotel_id`, `hotel_name`, `address`, `city`, `state`, `zip_code`, `country`, `phone_number`, `email`, `star_rating`, `description`, `created_at`, `updated_at`) VALUES
(1, 'test', 'test', 'test', 'test', '6018', 'test', '092323232', 'test@gmail.com', 5.0, 'this is a test', '2025-05-16 18:15:56', '2025-05-16 18:15:56'),
(2, 'SunStar', 'Talisay Cebu City', 'Cebu City', 'Generic', '6210', 'Phillipines', '09232323232', 'sunstar@gmail.com', 5.0, 'A Premium Hotel merged with VIP rooms and pools, With free meals and snacks, suited for all of your needs.', '2025-05-19 16:15:55', '2025-05-19 16:15:55');

-- --------------------------------------------------------

--
-- Table structure for table `reserved_rooms`
--

CREATE TABLE `reserved_rooms` (
  `reservation_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `reservation_status` varchar(20) DEFAULT 'pending',
  `check_in_date` date DEFAULT NULL,
  `check_out_date` date DEFAULT NULL,
  `num_guests` int(11) DEFAULT NULL,
  `special_requests` text DEFAULT NULL,
  `expiration_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reserved_rooms`
--

INSERT INTO `reserved_rooms` (`reservation_id`, `room_id`, `user_id`, `reservation_status`, `check_in_date`, `check_out_date`, `num_guests`, `special_requests`, `expiration_date`) VALUES
(1, 8, 16, 'approved', '2025-05-21', '2025-05-22', 4, 'None', '2025-05-28 15:22:23'),
(2, 18, 18, 'approved', '2025-05-28', '2025-05-30', 12, 'None', '2025-05-28 15:35:06');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `room_id` int(11) NOT NULL,
  `hotel_id` int(11) NOT NULL,
  `room_number` varchar(20) DEFAULT NULL,
  `room_type` varchar(50) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `status` varchar(20) DEFAULT 'available'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`room_id`, `hotel_id`, `room_number`, `room_type`, `price`, `status`) VALUES
(1, 1, '1', 'VIP', 5000.00, 'Available'),
(2, 2, '1', 'Casual', 2500.00, 'not available'),
(8, 2, '2', 'Deluxe', 3000.00, 'not available'),
(9, 2, '3', 'VIP', 5000.00, 'available'),
(10, 2, '4', 'Casual', 2500.00, 'not available'),
(11, 2, '5', 'Suite', 6000.00, 'available'),
(12, 2, '6', 'Family', 3500.00, 'available'),
(13, 2, '7', 'Deluxe', 3200.00, 'not available'),
(14, 2, '8', 'Casual', 2500.00, 'not available'),
(15, 2, '9', 'VIP', 5000.00, 'not available'),
(16, 2, '10', 'Suite', 6200.00, 'available'),
(17, 2, '11', 'Family', 3600.00, 'not available'),
(18, 2, '12', 'Casual', 2400.00, 'not available'),
(19, 2, '13', 'Deluxe', 3100.00, 'available'),
(20, 2, '14', 'VIP', 5200.00, 'not available'),
(21, 2, '15', 'Family', 3700.00, 'available'),
(22, 2, '16', 'Suite', 6400.00, 'not available');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(150) NOT NULL,
  `fname` varchar(150) NOT NULL,
  `lname` varchar(150) NOT NULL,
  `gender` varchar(150) NOT NULL,
  `account_type` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL,
  `uname` varchar(150) NOT NULL,
  `pname` varchar(150) NOT NULL,
  `contact` varchar(150) NOT NULL,
  `status` varchar(150) NOT NULL,
  `image` varchar(255) NOT NULL,
  `sq` varchar(255) DEFAULT NULL,
  `ans` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `fname`, `lname`, `gender`, `account_type`, `email`, `uname`, `pname`, `contact`, `status`, `image`, `sq`, `ans`) VALUES
(11, 'Mark', 'MARK', 'Male', 'sttaff', 'mark@gmail.com', 'mark', 'ETdlsUaGcDe4FKjvHC7DXXO/t3yNJ6XxpSAJn1lJz6o=', '90586795867', 'Active', '', '', ''),
(12, 'kiven', 'kiven', 'Male', 'staff', 'kiven@gmail.com', 'kiven', 'ETdlsUaGcDe4FKjvHC7DXXO/t3yNJ6XxpSAJn1lJz6o=', '908690586', 'Active', '', '', ''),
(13, 'test', 'test', 'Male', 'Admin', 'test@gmail.com', 'test123', 'ETdlsUaGcDe4FKjvHC7DXXO/t3yNJ6XxpSAJn1lJz6o=', '098765432', 'Active', 'src/Images/2.PNG', '', ''),
(14, 'testtest', 'test', 'Male', 'Admin', 'Test123@gmail.com', 'test12345', 'ETdlsUaGcDe4FKjvHC7DXXO/t3yNJ6XxpSAJn1lJz6o=', '09123434554', 'Active', 'src/Images/3event.PNG', NULL, NULL),
(15, 'adminis', 'admin', 'Male', 'Admin', 'adminis@gmail.com', 'administrator', 'LINbqJZtkCEg+0UEA3+tNO/6S5Rh6YjkxNoHOtUNroI=', '0987654321', 'Active', '', 'What is your Code name?', 'Babylonian'),
(16, 'user', 'user', 'Male', 'Admin', 'user@gmail.com', 'user', '84c4413971b9a2581540ad5d3424faa3eed5fdba34221c4d450398f32c8920bc', '092323543554', 'Active', 'src/Images/billingpic.png', 'What\'s your favorite food?', 'yes'),
(17, 'testtttt', 'rsttttt', 'Male', 'Admin', 'tedt@gmail.com', 'test123456', 'h3bxCOJHqx4rMjBCwEnCZkB8gfutQb3h6N/Bu2b9Jn4=', '092632323', 'Active', '', 'What\'s your favorite food?', 'no'),
(18, 'Thelma', 'Brooklyn', 'Female', 'Client', 'test1233@gmail.com', 'alcaya123', 'ba72a5c8d942b7678c32a54110b2d65dde3f28021e0836de054267b359256725', '09232435454', 'Active', '', 'What is your Code name?', 'Bear'),
(19, 'Adolf', 'Borja', 'Male', 'Admin', 'adolf@gmail.com', 'adolf123', 'cb997e6a552a1918d93f5acbc11d554ff3a35679abd4a42920b7f5f45f57baaa', '09914410936', 'Active', '', 'What is your favorite place?', 'naga');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booked_rooms`
--
ALTER TABLE `booked_rooms`
  ADD PRIMARY KEY (`booking_id`),
  ADD KEY `room_id` (`room_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `function_logs`
--
ALTER TABLE `function_logs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `hotels`
--
ALTER TABLE `hotels`
  ADD PRIMARY KEY (`hotel_id`);

--
-- Indexes for table `reserved_rooms`
--
ALTER TABLE `reserved_rooms`
  ADD PRIMARY KEY (`reservation_id`),
  ADD KEY `room_id` (`room_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`room_id`),
  ADD KEY `hotel_id` (`hotel_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booked_rooms`
--
ALTER TABLE `booked_rooms`
  MODIFY `booking_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `function_logs`
--
ALTER TABLE `function_logs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123;

--
-- AUTO_INCREMENT for table `hotels`
--
ALTER TABLE `hotels`
  MODIFY `hotel_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `reserved_rooms`
--
ALTER TABLE `reserved_rooms`
  MODIFY `reservation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(150) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booked_rooms`
--
ALTER TABLE `booked_rooms`
  ADD CONSTRAINT `booked_rooms_ibfk_1` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`room_id`),
  ADD CONSTRAINT `booked_rooms_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `function_logs`
--
ALTER TABLE `function_logs`
  ADD CONSTRAINT `function_logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `reserved_rooms`
--
ALTER TABLE `reserved_rooms`
  ADD CONSTRAINT `reserved_rooms_ibfk_1` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`room_id`),
  ADD CONSTRAINT `reserved_rooms_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_ibfk_1` FOREIGN KEY (`hotel_id`) REFERENCES `hotels` (`hotel_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
