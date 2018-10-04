package parameterization;

import org.testng.annotations.DataProvider;

public class ParamDPMain {
	// @DataProvider(name="SearchProvider")
    @DataProvider
    //@DataProvider
    public static String[][] getDataFromDataprovider(){
    return new String[][] 
    	{
            { "Ag","India"},
            { "Kevin","USA"},
                                };

    }
    @DataProvider
    public static String[][] getDataFromDataprovider2(){
        return new String[][] 
        	{
                { "Ag","Pakistan"},
                { "Kevin","UK"},
                                    };

        }

}
