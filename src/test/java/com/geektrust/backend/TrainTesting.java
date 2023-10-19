package com.geektrust.backend;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.geektrust.backend.train.Controller.TrainController;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTesting {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private TrainController trainController;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        trainController = new TrainController();
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }


@Test
public void testArrivalAndDepartureForInput1() throws IOException {
    trainController.parseCommandsFromInputFile("input1.txt");
    String expectedOutput = readExpectedOutput("output1.txt");
    assertEquals(expectedOutput, getConsoleOutput());
}

@Test
public void testArrivalAndDepartureForInput2() throws IOException {
    trainController.parseCommandsFromInputFile("input2.txt");
    String expectedOutput = readExpectedOutput("output2.txt");
    assertEquals(expectedOutput, getConsoleOutput());
}

@Test
public void testJourneyEndedOutputForInput3() throws IOException {
    trainController.parseCommandsFromInputFile("input3.txt");
    String expectedOutput = readExpectedOutput("output3.txt");
    assertEquals(expectedOutput, getConsoleOutput());
}

@Test
public void testCommonStationsInBothBogiesForInput4() throws IOException {
    trainController.parseCommandsFromInputFile("input4.txt");
    String expectedOutput = readExpectedOutput("output4.txt");
    assertEquals(expectedOutput, getConsoleOutput());
}

@Test
public void testComplexJourneyWithMultipleStopsForInput5() throws IOException {
    trainController.parseCommandsFromInputFile("input5.txt");
    String expectedOutput = readExpectedOutput("output5.txt");
    assertEquals(expectedOutput, getConsoleOutput());
}




@Test
public void testArrivalAndDepartureForInput6() throws IOException {
    trainController.parseCommandsFromInputFile("input6.txt");
    String expectedOutput = readExpectedOutput("output6.txt");
    assertEquals(expectedOutput, getConsoleOutput());
}


    private String getConsoleOutput() {
        return outContent.toString();
    }

    private String readExpectedOutput(String expectedOutputFile) throws IOException {
        return new String(
                Files.readAllBytes(Paths.get("src/test/sample_output/" + expectedOutputFile)));
    }
}
