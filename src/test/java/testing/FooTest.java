package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    private Foo foo;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach() {
        foo = new Foo();
        System.out.println("Before Each");
    }

    @Test
    public void testFooBar() {
        System.out.println("FooBar");
        //Foo foo = new Foo(); //Arrange: creating foo instance

        String result = foo.fooBar(); //Act: doing CUT(code under test) operation

        assertEquals("FooBar", result); //Assert:
    }

    @Test
    public void testFooBar2() {
        System.out.println("FooBar2");
        //Foo foo = new Foo(); //Arrange: creating foo instance

        String result = foo.fooBar(); //Act: doing CUT(code under test) operation

        assertEquals("FooBar", result); //Assert:
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

}