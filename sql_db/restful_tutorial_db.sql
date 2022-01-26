-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Gen 20, 2021 alle 12:43
-- Versione del server: 10.4.17-MariaDB
-- Versione PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restful_tutorial_db`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `contact`
--

CREATE TABLE `contact` (
  `kind` varchar(16) NOT NULL,
  `value` varchar(128) NOT NULL,
  `cf` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `employee`
--

CREATE TABLE `employee` (
  `cf` varchar(16) NOT NULL,
  `name` varchar(32) NOT NULL,
  `surname` varchar(32) NOT NULL,
  `date` date NOT NULL,
  `place` varchar(64) NOT NULL,
  `role_name` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `role`
--

CREATE TABLE `role` (
  `role_name` varchar(128) NOT NULL,
  `salary` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `shift`
--

CREATE TABLE `shift` (
  `shift_code` varchar(8) NOT NULL,
  `day` varchar(16) NOT NULL,
  `start_time` int(11) NOT NULL,
  `end_time` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `shift_assignment`
--

CREATE TABLE `shift_assignment` (
  `cf` varchar(16) NOT NULL,
  `shift_code` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `task`
--

CREATE TABLE `task` (
  `id_task` int(11) NOT NULL,
  `description` varchar(256) NOT NULL,
  `deadline` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `task_assignment`
--

CREATE TABLE `task_assignment` (
  `cf` varchar(16) NOT NULL,
  `id_task` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`kind`,`value`,`cf`),
  ADD KEY `contact_ibfk_1` (`cf`);

--
-- Indici per le tabelle `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`cf`),
  ADD KEY `employee_ibfk_1` (`role_name`);

--
-- Indici per le tabelle `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_name`);

--
-- Indici per le tabelle `shift`
--
ALTER TABLE `shift`
  ADD PRIMARY KEY (`shift_code`);

--
-- Indici per le tabelle `shift_assignment`
--
ALTER TABLE `shift_assignment`
  ADD PRIMARY KEY (`cf`,`shift_code`),
  ADD KEY `shift_code` (`shift_code`);

--
-- Indici per le tabelle `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`id_task`);

--
-- Indici per le tabelle `task_assignment`
--
ALTER TABLE `task_assignment`
  ADD PRIMARY KEY (`cf`,`id_task`),
  ADD KEY `task_assignmet_ibfk_1` (`id_task`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `task`
--
ALTER TABLE `task`
  MODIFY `id_task` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `contact`
--
ALTER TABLE `contact`
  ADD CONSTRAINT `contact_ibfk_1` FOREIGN KEY (`cf`) REFERENCES `employee` (`cf`);

--
-- Limiti per la tabella `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`role_name`) REFERENCES `role` (`role_name`);

--
-- Limiti per la tabella `shift_assignment`
--
ALTER TABLE `shift_assignment`
  ADD CONSTRAINT `shift_assignment_ibfk_1` FOREIGN KEY (`shift_code`) REFERENCES `shift` (`shift_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `shift_assignment_ibfk_2` FOREIGN KEY (`cf`) REFERENCES `employee` (`cf`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limiti per la tabella `task_assignment`
--
ALTER TABLE `task_assignment`
  ADD CONSTRAINT `task_assignment_ibfk_1` FOREIGN KEY (`id_task`) REFERENCES `task` (`id_task`),
  ADD CONSTRAINT `task_assignment_ibfk_2` FOREIGN KEY (`cf`) REFERENCES `employee` (`cf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
