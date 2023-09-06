package com.luv2code.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.Random.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
    }

    @Test
    @DisplayName("Equals and not Equals")
    void testEqualsAndNotEquals() {
        assertEquals(6, demoUtils.add(2, 4), "2+6 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");

    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull() {

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }
@DisplayName("Same and Not Same")
@Test
    void testSameAndNotSame(){
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(), "Objects should refer same oject");
        assertNotSame(str, demoUtils.getAcademy(), "Object should not refer to same object");
    }
    @DisplayName("True and False")
    @Test
    void testTrueFalse(){
        int gradeOne= 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne), "This should return false");
    }
    @DisplayName("Array Equals")
    @Test
    void testArrayEquals(){
        String[] stringArray = {"A", "B", "C"};
        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }
    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals(){
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same");
    }

    @DisplayName("Lines Match")
    @Test
    void testLinesMatch(){
        List<String> theList = List.of("luv","2","code");

        assertLinesMatch(theList,demoUtils.getAcademyInList(), "Lines should match");
    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class,()->{demoUtils.throwException(-1);}, "Should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(9);}, "Should not throw exception");
    }
    @DisplayName("Timeout")
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofSeconds(3), ()-> {demoUtils.checkTimeout();
        }, "Method should execute in 3 seconds");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply(){
        assertEquals(12,demoUtils.multiply(3,4), "3*4 must be 12");
    }





/*
    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }
    @AfterAll
    static void tearAfterAll(){
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }

 */
}
