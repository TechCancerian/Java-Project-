-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 20, 2018 at 09:18 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('101706080', 'jhajjz'),
('taman', 'bajwa');

-- --------------------------------------------------------

--
-- Table structure for table `analog_circuits`
--

CREATE TABLE IF NOT EXISTS `analog_circuits` (
  `Ques` varchar(100) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `basic_elctrical_engg`
--

CREATE TABLE IF NOT EXISTS `basic_elctrical_engg` (
  `Ques` varchar(300) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `basic_elctrical_engg`
--

INSERT INTO `basic_elctrical_engg` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('In a series circuit, which of the parameters remain constant across all circuit elements such as resistor, capacitor and inductor etcetera?', 'Voltage', 'Current', 'Both voltage and current', 'Neither voltage nor current', 2, 1),
(' If there are two bulbs connected in series and one blows out, what happens to the other bulb?', 'The other bulb continues to glow with the same brightness', 'The other bulb stops glowing', 'The other bulb glows with increased brightness', 'The other bulb also burns out', 2, 1),
('Voltage across a series resistor circuit is proportional to?', 'The amount of time the circuit was on for', 'The value of the resistance itself ', 'The value of the other resistances in the circuit', 'The power in the circuit', 2, 1),
('Many resistors connected in series will?', 'Divide the voltage proportionally among all the resistors ', 'Divide the current proportionally', 'Increase the source voltage in proportion to the values of the resistors', 'Reduce the power to zero', 1, 1),
('What happens to the current in the series circuit if the resistance is doubled?', ' It becomes half its original value ', 'It becomes double its original value ', 'It becomes zero ', 'It becomes infinity', 1, 1),
('KCL deals with the conservation of?', 'Momentum ', 'Mass', 'Potential Energy', 'Charge', 4, 1),
(' Which of the following statements are true?', 'Power is proportional to Voltage ', 'Power is proportional to current', 'Neither of the statements are right ', 'Both the statements are right', 4, 1),
('Which among the following is a unit for electrical energy? ', 'V(volt)', 'Wh(kilowatt-hour)', 'Ohm ', ' C(coloumb)', 2, 1),
('In a ____________ circuit, the total resistance is smaller than the smallest resistance in the circuit.', 'Series', 'Parallel', ' Either series or parallel ', 'Neither series nor parallel', 2, 1),
('The SI unit of power is?', ' kW(kilo-watt)', 'J/s(joules per second)', 'Ws(watt-second) ', 'J/h(joules per hour', 2, 1),
('Which of the following statements are true with regard to resistivity? a)  b)  c) d) ', 'Resistance depends on the temperature', 'Resistance does not depend on the temperature', 'Resistance does not depend on length ', 'All the statements are false', 1, 1),
('The maximum power is delivered to a circuit when source resistance is __________ load resistance.', 'Greater than', 'Equal to', 'Less than ', 'Greater than or equal to', 2, 1),
('Which of the following is also known as the dual of Thevenin’s theorem? ', 'Norton’s theorem ', 'Superposition theorem', ' Maximum power transfer theorem ', 'Millman’s theorem', 1, 1),
('Which, among the following qualities, is not affected by the magnetic field?', 'Moving charge', 'Change in magnetic flux ', 'Current flowing in conductor ', 'Stationary charge', 4, 1),
('How can a magnetic field be produced? a) b) c)d) ', 'Using a permanent magnet ', 'Electric current ', ' Using a temporary magnet ', 'Using a permanent magnet or electric current', 4, 1),
('For high frequencies, capacitor acts as _________ ', 'Open circuit', 'Short circuit', 'Amplifier', 'Rectifier', 2, 1),
('Practically, if 10kJ of energy is supplied to a device, how much energy will the device give back? ', ' Equal to10kJ', ' Less than 10kJ', 'More than 10kJ', 'Zero', 2, 1),
('Which, among the following is a unit for resistivity? a)  b)  c)  d) ohm-metre2', 'ohm/metre', 'ohm/metre^2', 'ohm-metre', 'ohm-metre^2', 3, 1),
('When will capacitor fully charged? ', 'When the voltage across its plates is half the voltage from ground to one of its plates', ' When current through the capacitor is a 1/root2 time its value', 'When the supply voltage is equal to the capacitor voltage', 'Never', 3, 1),
('What will happen to the capacitor when the source is removed? ', 'It will not remain in its charged state ', ' It will remain in its charged state', 'It will start discharging ', 'It will become zero', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `c`
--

CREATE TABLE IF NOT EXISTS `c` (
  `Ques_No` int(100) NOT NULL,
  `Ques` varchar(200) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `c`
--

INSERT INTO `c` (`Ques_No`, `Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
(1, ' C language has been developed by', 'Martin Richards ', 'Bijarne Stroustrup ', ' Dennis Ritche ', 'Ken Thompson', 3, 1),
(2, 'Which of the following is not a valid variable name declaration?', ' int __a3;', 'int __3a; ', 'int __A3; ', ' None of the mentioned', 4, 1),
(3, 'Which of the following declaration is not supported by C? ', 'String str; ', 'char *str;', 'float str = 3e2; ', ' Both String str; & float str = 3e2;', 1, 1),
(4, 'Which of the following is not an arithmetic operation? ', 'a *= 10;', 'a /= 10;', 'a != 10;', 'a %= 10;', 3, 1),
(5, 'Which of the following data type will throw an error on modulus operation(%)? ', 'char', 'short', 'int', 'float', 4, 1),
(6, 'Relational operators cannot be used on:', 'structure', 'long', 'strings', 'float', 1, 1),
(7, 'Which of the following cannot be used as LHS of the expression in for (exp1;exp2; exp3) ?', 'Variable', 'Function', 'typedef', 'macros', 4, 1),
(8, 'Which of the following is a correct format for declaration of function? ', 'return-type function-name(argument type);', 'eturn-type function-name(argument type) {}', 'return-type (argument type)function-name;', 'all of the mentioned', 1, 1),
(9, 'Which of the following cannot be static in C? ', 'Variables', 'Functions', 'Structures', ' None of the mentioned', 4, 1),
(10, ' Which is an indirection operator among the following? ', '&', '*', '->', '.', 2, 1),
(11, 'An array of similar data types which themselves are collection of dissimilar data type are', 'Linked Lists ', 'Trees', 'Array of Structure', 'All of the mentioned', 3, 1),
(12, 'What is the correct syntax to send a 3-dimensional array as a parameter? (Assuming declaration int a[5][4][3];)', ' func(a);', 'func(&a); ', ' func(*a); ', ' func(**a);', 1, 1),
(13, ' Which operator connects the structure name to its member name?', ' –', '<- ', ' .', ' Both <- and .', 3, 1),
(14, 'Which of the following is not a valid C variable name? ', ' int number;', ' float rate; ', 'int variable_count; ', 'int $main;', 4, 1),
(15, 'Which of the following is not a pointer declaration?', ' char a[10];', 'char a[] = {‘1’, ‘2’, ‘3’, ‘4’};', ' char *str;', 'char a;', 4, 1),
(16, 'Result of a logical or relational expression in C is ', 'True or False', '0 or 1', '0 if expression is false and any positive number if expression is true', ' None of the mentioned', 2, 1),
(17, 'The value obtained in the function is given back to main by using ________ keyword? ', 'return', 'static', 'new', 'volatile', 1, 1),
(18, ' Comment on an array of void data type:', ' It can store any data-type', 'It only stores element of similar data type to first element', ' It acquires the data type with the highest precision in it', 'You cannot have an array of void data type', 4, 1),
(19, 'Applications of multidimensional array are? ', 'Matrix-Multiplication', 'Minimum Spanning Tree', ' Finding connectivity between nodes', ' All of the mentioned', 4, 1),
(20, 'Which of the following  is not possible under any scenario?', 's1=&s2;`', 's1=s2;', '(*s1).number=10;', 'None of the mentioned', 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `computer_fundamentals`
--

CREATE TABLE IF NOT EXISTS `computer_fundamentals` (
  `Ques` varchar(200) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `computer_fundamentals`
--

INSERT INTO `computer_fundamentals` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('Which unit is responsible for converting the data received from the user into computer understandable format? ', 'Memory Unit', 'Arithmetic & Logic Unit', 'Input Unit ', 'Output Unit', 3, 1),
('IEEE stands for ___________ ', ' Instantaneous Electrical Engineering', ' Institute of Emerging Electrical Engineers ', ' Institute of Emerging Electronic Engineers ', 'Institute of Electrical and electronics engineers', 4, 1),
('A decoder is required in case of a ______________ ', 'Vertical Microinstruction ', 'Horizontal Microinstruction ', 'Multilevel Microinstruction', 'All types of microinstructions', 1, 1),
('What does MAR stand for? ', 'Main Address Register', 'Memory Access Register ', 'Main Accessible Register ', ' Memory Address Register', 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `cpp`
--

CREATE TABLE IF NOT EXISTS `cpp` (
  `Ques` varchar(100) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `electromagnetic_theory`
--

CREATE TABLE IF NOT EXISTS `electromagnetic_theory` (
  `Ques` varchar(100) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `electronic_devices_and_circuits`
--

CREATE TABLE IF NOT EXISTS `electronic_devices_and_circuits` (
  `Ques` varchar(100) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `engineering_chemistry`
--

CREATE TABLE IF NOT EXISTS `engineering_chemistry` (
  `Ques` varchar(200) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `engineering_chemistry`
--

INSERT INTO `engineering_chemistry` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('The region of electromagnetic spectrum for nuclear magnetic resonance is ', 'Microwave', 'Radio frequency', 'Infrared', 'UV-rays', 2, 1),
('The criteria for electronic spin resonance is', 'Periodic change in polarisability', 'Spin quantum number of nuclei > 0 ', 'Presence of unpaired electron in a molecule', 'Presence of chromophore in a molecule', 3, 1),
('The p-orbital is in the shape of a ', 'Sphere', 'Dumbbell', 'Pear-shaped lobe', 'None of the mentioned', 2, 1),
('Which orbital would form more stronger bond if both of them have identical stability? ', 'The one which is less directionally concentrated', 'The one which is more directionally concentrated', ' Both will be equally strong', 'It differs from atom to atom', 2, 1),
('The filling of molecular orbital takes place according to ', 'The Aufbau Principle ', ' Pauli Exculsion Principle', ' Hund’s rule of maximum multiplicity', 'All of the mentioned', 4, 1),
('According to Molecular Orbital Theory, the shape and size of a molecular orbital depends upon', 'Shape and size of the combining atomic orbitals', 'Numbers of the combining atomic orbitals', ' Orientation of the combining atomic orbitals ', 'All of the mentioned', 4, 1),
('How many optical isomers are possible in a compound with one chiral carbon? ', '5', '4', '2', '3', 4, 1),
('For a molecule with two like chiral carbon atoms, the number of optically inactive form is', '1', '2', '3', '4', 1, 1),
('Crystallisation is based on the ', 'Difference in melting point', 'Difference in boiling point', 'Difference in pressure', 'Difference in solubility', 4, 1),
('The solution of impure compound and solvent is concentrated to get', 'Unsaturated solution ', 'Undersaturaed solution', 'Saturated solution', 'Oversaturated solution', 3, 1),
('The apparatus used for the determination of surface tension of a liquid is ', 'Oedometer', 'Stalagmometer', 'Consolidometer', 'None of the mentioned', 2, 1),
('Shapes of drops of liquid are spherical because of', 'Viscosity', 'Conductivity', 'Absorption', 'Surface tension', 4, 1),
('Chromatography involves two mutually ', 'Immiscible phases ', 'Miscible phases', 'Soluble phases', 'None of the mentioned', 1, 1),
('The relative solubility of solute in both the phases determines the ', 'Rate of movement of solvent', 'Rate of disappearance of solvent', 'Rate of movement of solute', 'Rate of disappearance of solute', 3, 1),
('The energy level with lower energy is called', 'Ground state energy level', 'Initial state energy level', 'Excited state energy level ', 'All of the mentioned', 1, 1),
('The necessary condition for absorption spectrum is that ', 'hv should be greater than energy difference', 'hv should be smaller than energy difference ', 'hv should be equal to the energy difference ', 'None of the mentioned', 3, 1),
('The reaction rate is defined as the rate at which the concentration of the reactants __________ with time or the concentration of products ___________ with time. ', 'Increase, increase', 'Decrease, decrease', 'Decrease, increase ', 'Increase, decrease', 3, 1),
('Which of the following indicator is pink in basic medium?', 'Methyl orange ', 'Phenolphthalein', 'Starch ', 'Litmus paper', 2, 1),
('What are the disadvantage of using high alkaline water? ', 'It may lead to infections', 'It may lead to electrolysis', 'It may lead to caustic embrittlement ', 'It may lead to indigestion', 3, 1),
('Hardness of water is due to the presence of salts of', 'Potassium', 'Chlorine', 'Magnesium', 'Boron', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `engineering_mechanics`
--

CREATE TABLE IF NOT EXISTS `engineering_mechanics` (
  `Ques` varchar(200) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `engineering_mechanics`
--

INSERT INTO `engineering_mechanics` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('If A is any vector with Ai + Bj + Ck then what is the y-axis component of the vector?', 'B units', 'A units ', 'C units ', 'Square root of sum of squares of the three, i.e. A, B and C', 1, 1),
('Which statement is right? ', ' Multiplicative law: a(A.B) = Ax(aB) ', 'Communitive law: A.B =B.A ', 'Multiplicative law: A.(B+D) = (A.B) + (A.D) ', 'Communitive law: a(A.B) = A.(aB)', 2, 1),
('What does the moment of the force measure? ', ' The tendency of rotation of the body along any axis', 'The moment of inertia of the body about any axis', ' The couple moment produce by the single force acting on the body ', 'The total work done on the body by the force', 1, 1),
('The tendency of rotation of the body along any axis is also called ___________', 'Moment of inertia', 'Moment of couple', 'Torque', 'Force', 3, 1),
('Which of the following is correct for the moment of couple M caused by two forces of same magnitude F and are separated by a distance of r? ', ' M = rxF', 'M = r.F', 'M = -(rxF)', 'M = -(r.F)', 1, 1),
('A couple moment is a _______ vector. ', 'Gradient', 'Scalar', 'Del', 'Free', 4, 1),
('To design the trusses which of the following rules is followed? ', 'All the loads are applied by the use of cables', 'The loads ae applied at the joint', 'All the loads are not applied at the joints', 'The loads are not applied at all to the joints', 2, 1),
('The free body diagram of which part of the section of the truss is made to make use of method of joints? ', 'Joints', 'Truss', 'The whole structure', 'The combination of joint and the whole structure', 1, 1),
('If two members of the structure (trusses) forms a truss joint and there is no external force acting on that joint then the two members are called___________', 'Scalar form of the force vector', 'The equivalent vector of truss', 'Zero moment member', ' Zero force member', 4, 1),
('The couple and the other two force systems can be easily simplified. ', ' Statement is wrong ', ' Statement is right', 'Statement is right if we remove ‘couple’ part', 'Statement is right if we remove ‘force’ part', 2, 1),
('___________ are used as support loads. ', 'Frames', 'Machines', 'Truss', 'Beam', 1, 1),
('If two equal vector forces are mutually perpendicular then the resultant force is acting at which angle as compared to one of the vector? ', '180 degree ', ' 90 degree ', ' 45 degree ', '0 degree', 3, 1),
('he all small weights that are being applied by all the infinite particles of the body act __________ to each other.', 'Parallel', 'Perpendicular', 'Collinear', 'Divergent', 1, 1),
('If the non-Uniform loading is of the type of parabola then?', 'The net load will not be formed as all the forces will be cancelled', 'The net force will act the centre of the parabola', 'The net force will act on the base of the loading horizontally', 'The net force will act at the centroid of the parabola', 4, 1),
('The centre of ____________ is the ratio of the product of centroid and volume to the total volume. ', 'Centroid axis ', 'Density', 'Volume', 'Mass', 3, 1),
('The parallel axis theorem uses the ____________ of the distance. ', 'Square root ', 'Square', 'Cube root ', 'Cube', 2, 1),
('The principle of work was proposed by________________', 'Mathematician Jean Bernoulli', 'Physios Jean Bernoulli ', 'Chemist Jean Bernoulli ', 'John Jean Bernoulli', 1, 1),
('We often determine the work done by the couples. A couple moment is developed when _______ of the attached member is prevented. ', 'Translation', 'Rotation', 'Addition', 'Subtraction', 2, 1),
('Air also resist the body in the motion. The maximum value of the frictional force is called _________', ' Non-Limiting Friction', 'Limiting Friction', 'Limiting Action Friction', 'Non-Limiting Action Friction', 2, 1),
('Find the angle alpha, for the vector making an angle by y and z axis as 60 deg and 45 deg respectively. It makes an angle of alpha with x-axis. The magnitude of the force is 200N. ', '60 deg', '120 deg', ' 45 deg', '90 deg', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `engineering_physics`
--

CREATE TABLE IF NOT EXISTS `engineering_physics` (
  `Ques` varchar(200) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `engineering_physics`
--

INSERT INTO `engineering_physics` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('Which of the following waves can be transmitted through solids, liquids and gases?', 'Transverse waves', 'Electromagnetic waves', 'Mechanical waves', 'Longitudinal waves', 4, 1),
('What happens if the reverberation time is too large? ', 'The sound becomes inaudible', 'Echoes are produced', 'Frequency becomes high ', 'The sound becomes infrasonic', 2, 1),
('Which of the following is a unique property of laser?', 'Directional', 'Speed', 'Coherence', 'Wavelength', 3, 1),
('What is the principle of fibre optical communication? ', ' Frequency modulation', 'Population inversion', 'Total internal reflection', 'Doppler Effect', 3, 1),
('How is the resistance of semiconductor classified? ', 'High resistance  ', 'Positive temperature co-efficient ', 'Negative temperature co-efficient', 'Low resistance', 3, 1),
(' The coefficient of static friction is', 'Less than the coefficient of kinetic friction', 'Greater than the coefficient of limiting friction ', 'Equal to coefficient of kinetic friction', 'Equal to the tangent of the angle of friction', 4, 1),
('In which of the following ways the accelerated motion of a body will occur under an external force? ', 'Due to change in direction', 'Due to inability to change its direction', 'Due to inability to change its speed ', 'Due to its ability to remain at rest', 1, 1),
(' What sort of energy does a flying bird posses?', 'Potential energy', ' Kinetic energy', ' Elastic energy', ' Both potential and kinetic energy', 4, 1),
('A bullet fired from a gun can pierce a target due to its', 'Mechanical energy', 'Heat energy', 'Kinetic energy ', 'Acceleration', 3, 1),
('Which of the following retain their relative positions even when they move under the action of an external force? ', 'Rotation body ', 'Stationary body', 'Rigid body ', 'A body in equilibrium', 3, 1),
('Sound travels through a gas under which of the following condition? ', 'Isothermal condition ', 'Non-isothermal condition', 'Adiabatic condition', 'Transverse condition', 3, 1),
('What happens when window panel sections of the wooden portions are thrown into vibrations to produce new sounds? ', 'Vibrations are produced ', 'Resonance occurs ', 'Echoes are produced', 'Absorption occurs', 2, 1),
(' What is the need to achieve population inversion? ', ' To excite most of the atoms ', 'To bring most of the atoms to ground state', 'To achieve stable condition ', ' To reduce the time of production of laser', 1, 1),
('Which of the following is known as fibre optic back bone? ', 'Telecommunication', 'Cable television', 'Delay lines', ' Bus topology', 4, 1),
('What are the charge carriers in semiconductors? ', 'Electrons and holes', 'Electrons', 'Holes', 'Charges', 1, 1),
('. Friction can be increased by ', 'Using air cushion ', 'Lubricants', 'Using sand', 'Using ball bearings', 3, 1),
('Which of the following is an example for impulsive force?', 'A person in a moving bus', 'A horse suddenly stopping ', 'Force exerted by a bat hitting a ball ', 'Sharpening of knife', 3, 1),
('What happens to the potential energy when one proton and one electron are brought close together? ', 'The potential energy gets increased ', 'The potential energy gets converted into kinetic energy', 'The potential energy gets remains the same', 'The potential energy gets decreased', 4, 1),
('A simple pendulum hanging freely and at rest is vertical because in that position', 'Kinetic energy is zero', 'Potential energy is zero ', 'Kinetic energy is minimum ', 'Potential energy is minimum', 4, 1),
('Where does the centre of mass of two particles of equal mass lie?', 'Inside the body', 'Outside the body ', 'Near the first body ', ' Midway between them', 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

CREATE TABLE IF NOT EXISTS `java` (
  `Ques_No` int(100) NOT NULL,
  `Ques` varchar(200) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `java`
--

INSERT INTO `java` (`Ques_No`, `Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
(1, 'What is the range of short data type in Java? ', '-128 to 127', '-32768 to 32767', ' -2147483648 to 2147483647', 'None of the mentioned', 2, 1),
(2, 'Which of the following can be operands of arithmetic operators?', 'Numeric', 'Boolean ', 'Characters', 'Both Numeric & Characters', 4, 1),
(3, 'Which operator is used to invert all the digits in binary representation of a number? a)  b)  c)  d)', '~', '<<<', '>>>', '^', 1, 1),
(4, 'Which of these statements are incorrect? ', 'Equal to operator has least precedence', 'Brackets () have highest precedence ', 'Division operator, /, has higher precedence than multiplication operator ', 'Addition operator, +, and subtraction operator have equal precedence', 3, 1),
(5, 'Which concept of Java is achieved by combining methods and attribute into a class? ', 'Encapsulation', 'Inheritance', 'Polymorphism', 'Abstraction', 1, 1),
(6, 'Which of these statement is incorrect? ', 'Every class must contain a main() method', ' Applets do not require a main() method at all ', 'There can be only one main() method in a program', ' main() method must be made public', 1, 1),
(7, 'Which keyword is used by method to refer to the object that invoked it? ', 'import', 'catch', 'abstract', 'this', 4, 1),
(8, 'Which function is used to perform some action when the object is to be destroyed? ', 'finalize()', 'delete()', ' main()', 'None of the mentioned', 1, 1),
(9, 'What would be the behaviour if this() and super() used in a method?', 'Runtime error', ' Throws exception ', ' compile time error', 'Runs successfully', 3, 1),
(10, 'What is the process of defining a method in terms of itself, that is a method that calls itself? ', 'Polymorphism', 'Abstraction', 'Encapsulation', 'Recursion', 4, 1),
(11, 'Which of these method of String class can be used to test to strings for equality?', 'isequal()', ' isequals()', 'equal()', 'equals()', 4, 1),
(12, 'Which of these is correct way of calling a constructor having no parameters, of superclass A by subclass B? ', ' super(void); ', ' superclass.(); ', 'super();', 'super.A();', 3, 1),
(13, 'Which of these keywords can be used to prevent inheritance of a class? ', 'constant', 'final', 'super', 'class', 2, 1),
(14, 'Using which of the following, multiple inheritance in Java can be implemented? ', 'Interfaces', 'Protected methods', 'Multithreading', 'Private methods', 1, 1),
(15, 'If super class and subclass have same variable name, which keyword should be used to use super class?', 'this', 'upper', 'super', 'classname', 3, 1),
(16, 'Which of the following operators is used to generate instance of an exception which can be thrown using throw? ', 'thrown', 'alloc', 'malloc', 'new', 4, 1),
(17, 'Which of these statements is incorrect?', 'try block need not to be followed by catch block ', ' try block can be followed by finally block instead of catch block', 'ry can be followed by both catch and finally block ', 'try need not to be followed by anything', 4, 1),
(18, 'What would be the result if class extends two interfaces and both have method with same name and signature? ', 'Runtime error', 'Compile time error ', 'Code runs successfully ', 'First called method is executed successfully', 2, 1),
(19, 'Which of these method of class StringBuffer is used to concatenate the string representation to the end of invoking string?', 'concat()', 'append() ', 'join()', 'concatenate()', 2, 1),
(20, ' What is the stored in the object obj in following lines of code?   box obj; ', 'Memory address of allocated memory of object', 'NULL', 'Any arbitrary pointer ', 'Garbage', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `network_theory`
--

CREATE TABLE IF NOT EXISTS `network_theory` (
  `Ques` varchar(100) DEFAULT NULL,
  `Ans1` varchar(100) DEFAULT NULL,
  `Ans2` varchar(100) DEFAULT NULL,
  `Ans3` varchar(100) DEFAULT NULL,
  `Ans4` varchar(100) DEFAULT NULL,
  `Rans` int(11) DEFAULT NULL,
  `Active` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `paperc`
--

CREATE TABLE IF NOT EXISTS `paperc` (
  `Ques` varchar(100) NOT NULL,
  `Ans1` varchar(100) NOT NULL,
  `Ans2` varchar(100) NOT NULL,
  `Ans3` varchar(100) NOT NULL,
  `Ans4` varchar(100) NOT NULL,
  `Rans` int(100) NOT NULL,
  `Active` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paperc`
--

INSERT INTO `paperc` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('The keyword used to transfer control from a function back to the calling function is', 'switch', 'goto', 'go back', 'return', 4, 1),
('Which of the following special symbol allowed in a variable name?', '* (asterisk)', '| (pipeline)', '- (hyphen)', '_ (underscore)', 4, 1),
('In C, if you pass an array as an argument to a function, what actually gets passed?', 'Value of elements in array', 'First element of the array', 'Base address of the array', 'Address of the last element of array', 3, 1),
('If the two strings are identical, then strcmp() function returns', '-1', '1', '0', 'Yes', 3, 1),
('How will you print \\n on the screen?', 'printf("\\n");', 'echo "\\\\n";', 'printf(''\\n'');', 'printf("\\\\n");', 4, 1);

-- --------------------------------------------------------

--
-- Table structure for table `paperc++`
--

CREATE TABLE IF NOT EXISTS `paperc++` (
  `Ques` varchar(100) NOT NULL,
  `Ans1` varchar(100) NOT NULL,
  `Ans2` varchar(100) NOT NULL,
  `Ans3` varchar(100) NOT NULL,
  `Ans4` varchar(100) NOT NULL,
  `Rans` int(100) NOT NULL,
  `Active` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paperc++`
--

INSERT INTO `paperc++` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('Which of the following correctly declares an array?', 'int array[10];', ' int array;', 'array{10};', 'array array[10];', 1, 1),
('When will we use the function overloading?', 'same function name but different number of arguments', 'different function name but same number of arguments', 'same function name but same number of arguments', 'different function name but different number of arguments', 1, 1),
('What are mandatory parts in function declaration?', 'return type,function name', 'return type,function name,parameters', 'both a and b', 'none of the mentioned', 1, 1),
('Which keyword is used to check exception in the block of code?', 'catch', 'throw', 'try', 'None of the mentioned', 3, 1),
('Which concepts does the Pre Increment use?', 'call by value', 'call by reference', 'queue', 'None of the mentioned', 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `paperhtml`
--

CREATE TABLE IF NOT EXISTS `paperhtml` (
  `Ques` varchar(100) NOT NULL,
  `Ans1` varchar(100) NOT NULL,
  `Ans2` varchar(100) NOT NULL,
  `Ans3` varchar(100) NOT NULL,
  `Ans4` varchar(100) NOT NULL,
  `Rans` int(100) NOT NULL,
  `Active` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paperhtml`
--

INSERT INTO `paperhtml` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('HTML stands for?', 'Hyper Text Markup Language', 'High Text Markup Language', 'Hyper Tabular Markup Language', 'None of these', 1, 1),
('which of the following tag is used to mark a begining of paragraph ?', '<TD>', '<br>', '<P>', '<TR>', 3, 1),
('The attribute of <form> tag', 'Method', 'Action', 'Both (a)&(b)', 'None of these', 3, 1),
('Apart from <b> tag, what other tag makes text bold ? ', '<fat>', '<strong>', '<black>', '<emp>', 2, 1),
('What tag is used to display a picture in a HTML page? ', 'picture', 'image', 'img', 'src', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `paperm`
--

CREATE TABLE IF NOT EXISTS `paperm` (
  `Ques` varchar(100) NOT NULL,
  `Ans1` varchar(100) NOT NULL,
  `Ans2` varchar(100) NOT NULL,
  `Ans3` varchar(100) NOT NULL,
  `Ans4` varchar(100) NOT NULL,
  `Rans` int(11) NOT NULL,
  `Active` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paperm`
--

INSERT INTO `paperm` (`Ques`, `Ans1`, `Ans2`, `Ans3`, `Ans4`, `Rans`, `Active`) VALUES
('What is the range of short data type in Java?', '-128 to 127', ' -32768 to 32767', '-2147483648 to 2147483647', 'None of the mentioned', 2, 1),
(' What is the range of byte data type in Java?', '-128 to 127', '-32768 to 32767', '-2147483648 to 2147483647', 'None of the mentioned', 1, 1),
('An expression involving byte, int, and literal numbers is promoted to which of these?', 'int', 'long', 'byte', 'float', 1, 1),
('Which of these literals can be contained in float data type variable?', '-1.7e+308', '-3.4e+038', '+1.7e+308', '-3.4e+050', 2, 1),
('Which data type value is returned by all transcendental math functions?', 'int', 'float', 'double', 'long', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `regist`
--

CREATE TABLE IF NOT EXISTS `regist` (
  `Name` varchar(100) NOT NULL,
  `RollNo` varchar(100) NOT NULL,
  `Branch` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Phone` varchar(100) NOT NULL,
  `Batch` varchar(100) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `regist`
--

INSERT INTO `regist` (`Name`, `RollNo`, `Branch`, `Password`, `Phone`, `Batch`, `Address`) VALUES
('jhajj', '104', 'ECE', 'jsj', '213456789', '2021', 'doraha1'),
('gur', '101', 'CSE', 'komal', '4567324', '2020', 'shnewal2'),
('taman', '102', 'CSE', 'bajwa', '259259', '2022', 'vill.doraha'),
('jas', '103', 'CSE', '4jasdeep', '98765432', '21', 'doraha23'),
('jhajj33', '105', 'ECE', 'js', '21345', '21', 'doraha1');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE IF NOT EXISTS `report` (
  `Roll_no` int(100) NOT NULL,
  `Branch` varchar(100) NOT NULL,
  `Semester` varchar(100) NOT NULL,
  `Exam_Name` varchar(100) NOT NULL,
  `Exam_Date` varchar(100) NOT NULL,
  `Start_Time` varchar(100) NOT NULL,
  `End_Time` varchar(100) NOT NULL,
  `Total_Questions` int(100) NOT NULL,
  `Correct` int(100) NOT NULL,
  `Incorrect` int(100) NOT NULL,
  `Marks` int(100) NOT NULL,
  `Remarks` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`Roll_no`, `Branch`, `Semester`, `Exam_Name`, `Exam_Date`, `Start_Time`, `End_Time`, `Total_Questions`, `Correct`, `Incorrect`, `Marks`, `Remarks`) VALUES
(101, 'CSE', '8', 'c', '19-07-18', '11:11:46', '11:12:15', 10, 3, 7, 3, '0'),
(101, 'CSE', '8', 'java', '20-07-18', '11:49:51', '11:50:14', 10, 4, 6, 4, 'C Grade'),
(101, 'CSE', '8', 'java', '20-07-18', '11:55:21', '11:55:27', 10, 1, 9, 1, 'D Grade'),
(105, 'CSE', '8', 'java', '20-07-18', '12:00:04', '12:00:35', 10, 5, 5, 5, 'C Grade');

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE IF NOT EXISTS `schedule` (
  `Roll` int(100) NOT NULL,
  `Branch` varchar(100) NOT NULL,
  `Semester` varchar(100) NOT NULL,
  `Exam_Name` varchar(100) NOT NULL,
  `Exam_Date` varchar(100) NOT NULL,
  `Active` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`Roll`, `Branch`, `Semester`, `Exam_Name`, `Exam_Date`, `Active`) VALUES
(101, 'CSE', '8', 'c', '19-07-18', 1),
(102, 'CSE', '8', 'c', '19-07-18', 1),
(102, 'CSE', '8', 'cpp', '21-07-18', 1),
(103, 'CSE', '8', 'cpp', '20-07-18', 1),
(104, 'CSE', '8', 'java', '20-07-18', 1),
(105, 'CSE', '8', 'java', '20-07-18', 0),
(101, 'CSE', '8', 'java', '20-07-18', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tablelist`
--

CREATE TABLE IF NOT EXISTS `tablelist` (
  `Paper_Name` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tablelist`
--

INSERT INTO `tablelist` (`Paper_Name`, `Department`) VALUES
('Electronic_Devices_and_Circuits', 'ECE'),
('Engineering_Mechanics', 'ECE'),
('Analog_Circuits', 'ECE'),
('Engineering_Chemistry', 'ECE'),
('C', 'CSE'),
('CPP', 'CSE'),
('Java', 'CSE'),
('Computer_Fundamentals', 'CSE'),
('Basic_Elctrical_Engg', 'ELE'),
('Network_Theory', 'ELE'),
('Electromagnetic_Theory', 'ELE'),
('Engineering_Physics', 'ELE');

-- --------------------------------------------------------

--
-- Table structure for table `teacherregst`
--

CREATE TABLE IF NOT EXISTS `teacherregst` (
  `Name` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Date_Of_Joining` varchar(100) NOT NULL,
  `UserID` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Phone_No` varchar(100) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacherregst`
--

INSERT INTO `teacherregst` (`Name`, `Department`, `Date_Of_Joining`, `UserID`, `Password`, `Phone_No`, `Email`, `Address`) VALUES
('Glory bector', 'ECE', '10/5//2015', 'Glory', 'bector', '98765432', 'glory@kadsjfd.com', 'doraha'),
('Priyanka', 'ELE', '14.4.20010', 'pinku', 'narang', '98765432', 'knbvc@ mjn', 'ldh'),
('rupinder', 'CSE', '14,10,2010', 'rup', 'rupi', '98765432', 'kjhgfx@kjhv', 'doraha');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
