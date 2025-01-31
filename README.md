test class (CalculatorTest) using JUnit 5 to validate the functionality of the Calculator method.

Key Features of the Test Suite:
Setup and Teardown:

@BeforeEach and @AfterEach methods ensure test environment preparation and cleanup, though currently unused.
Unit Tests for Calculator Methods:

testAdd(): Verifies the correctness of integer addition.
testSubtract(): Ensures subtraction is computed correctly.
testMultiply(): Validates multiplication.
testDivide(): Confirms accurate integer division.
testAddString(): Tests the add(String numbers) method with a comma-separated input.
testAddWithArray(): Validates the add(int[] arrayNumbers) method.
Test Assertion:
Each test uses assertEquals(expected, actual) to ensure the actual output matches the expected result.
