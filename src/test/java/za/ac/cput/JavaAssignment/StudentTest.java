package za.ac.cput.JavaAssignment;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentTest {
    Student std1;
    Student std2;

    @Before
    public void setUp() throws Exception {
        std1 = new Student.Builder()
                .name("Steve")
                .age(20)
                .build();

        std2 = new Student.Builder()
                .name("Mela")
                .age(23)
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {

    }

    @Test
    public void getAge() {
    }

    @Test
    public void equals() {


    }

    @Test
    public void equality(){

        Assert.assertEquals(std1,std2);
    }

    @Test
    public void identity(){

        Assert.assertEquals(std1,std2);

    }

    @Test(timeout = 10000)
    public void Timeouts(){
        Assert.assertSame(std1,std2);
        while(true);
    }
    @Ignore
    @Test
    public void DisablingTest(){
        Assert.assertEquals(std1,std2);
    }

    @Test(expected = AssertionError.class)
    public void FailingTest(){
        Assert.assertEquals(std1,std2);
    }

}