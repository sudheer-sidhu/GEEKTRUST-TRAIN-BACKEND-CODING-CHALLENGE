# Train Management System

## Problem Statement

### Context

There are 2 super-fast trains, Train A and Train B. Train A travels from Chennai to New Delhi. Train B travels from Trivandrum to Guwahati.

Passengers can board these trains only at the source station. The trains have only reserved bogies, and each bogie will only have passengers traveling to a specific station. When the train arrives at a station, the entire bogie with passengers is detached from the train, and the train continues its journey.

The routes with station codes and distances of each station from the originating station are as follows:

##### Train A

CHENNAI (CHN) - 0
SALEM (SLM) - 350
BANGALORE (BLR) - 550
KURNOOL (KRN) - 900
HYDERABAD (HYB) - 1200
NAGPUR (NGP) - 1600
ITARSI (ITJ) - 1900
BHOPAL (BPL) - 2000
AGRA (AGA) - 2500
NEW DELHI (NDL) - 2700

##### Train B

TRIVANDRUM (TVC) - 0
SHORANUR (SRR) - 300
MANGALORE (MAQ) - 600
MADGAON (MAO) - 1000
PUNE (PNE) - 1400
HYDERABAD (HYB) - 2000
NAGPUR (NGP) - 2400
ITARSI (ITJ) - 2700
BHOPAL (BPL) - 2800
PATNA (PTA) - 3800
NEW JALPAIGURI (NJP) - 4200
GUWAHATI (GHY) - 4700

### The Merger:

During a part of their journey, these trains follow the same route and travel as one train - Train AB.

Trains start from their respective source stations and meet at Hyderabad.
Trains travel as Train AB from Hyderabad till Bhopal as a single train.
From Bhopal, the trains travel again as two independent trains, Train A and Train B.
Train A can have passengers in the route for Train B and vice versa. For example, people can board from Chennai in Train A and travel to Guwahati.

### Merging Rules:

First, both the engines are attached. The remaining bogies from Hyderabad are attached in the descending order of distances they have to travel further from Hyderabad. When the merged train reaches a station, the bogie for that station will be the last one and it can be detached quickly.

### Goal:

Given the initial bogie order of both trains, your program should print:

The bogie order of arrival of Train A and Train B at Hyderabad
Train AB's departure bogie order from Hyderabad
Assumptions
The passengers board only from the source station.
If there are no passenger bogies to travel from Hyderabad station, then the train should stop there. In such a case, it should print JOURNEY_ENDED.
The distances are in kilometers.
If there are multiple bogies with the same station as its destination, then they can be arranged next to each other when the Train AB leaves Hyderabad.

## Implementation:

For Implementation details you can check my train folder  and TrainTesting.java files present in src folder, for details related to inputs you can check my sample_input folder and for outputs sample_output folder in test folder.

## Usage:

To run the program, you can execute the main method in the App.java class.
The program takes input from text files in the sample_input folder and produces the desired output by comparing console output with outputs in sample_output folder.
The test cases in TrainTesting.java can be run to ensure the correctness of the implementation.

#### OR

To run the project, use the following command:

###### ./gradlew run

This command will execute the main method in the com.geektrust.backend.train folder, which will process the sample input files and display the arrival and departure order of bogies.

### Running Tests:

You can run the project's tests using the following command:

###### ./gradlew  clean test

###### ./gradlew  clean build

These will execute the unit tests and generate test reports.

Run the project as described in the Usage section to process the new input files.
