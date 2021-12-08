import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtmTest {
        //Arrange
        Atm underTest = new Atm(50, "1234");

    @Test
    public void defaultBalance50(){
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(50, actualBalance);

    }

    @Test
    public void defaultBalance100(){
        Atm underTest = new Atm(100, "1234");
        //Act
        int actualBalance = underTest.getBalance();
        //Assert
        assertEquals(100, actualBalance);
    }

    @Test
    public void deposit50IncreasingBalance(){
        underTest.deposit(50);
        int actualBalance = underTest.getBalance();
        assertEquals(100,actualBalance);

    }

    @Test
    public void withdraw50DecreasingBalance(){
        underTest.withdraw(25);
        int actualBalance = underTest.getBalance();
        assertEquals(25,actualBalance);
    }

    @Test
    public void withdrawOf51ReturnsOverdraft(){
        underTest.withdraw(51);
        int actualBalance = underTest.getBalance();
        assertEquals(50, actualBalance);
    }

    @Test
    public void shouldAllowUserAccess(){
        boolean accessResult = underTest.accessAccount("1234");
        assertEquals(true, accessResult);
    }

    @Test
    public void shouldDenyUserAccess(){
        boolean accessResult = underTest.accessAccount("1111");
        assertEquals(false, accessResult);
    }

}
