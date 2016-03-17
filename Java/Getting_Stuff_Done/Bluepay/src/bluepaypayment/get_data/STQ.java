/**
* BluePay Java Sample code.
*
* This code sample runs a report that grabs a single transaction
* from the BluePay gateway based on certain criteria.
* See comments below on the details of the report.
* If using TEST mode, only TEST transactions will be returned.
*/

package bluepaypayment.get_data;
import bluepaypayment.BluePayPayment_BP10Emu;

public class STQ {

	  public static void main(String[] args) {
	 
		String ACCOUNT_ID = "100221257489";
		String SECRET_KEY = "YCBJNEUEKNINP5PWEH1HRQDSQHYANPM/";
	    String MODE = "TEST";
	     
	    // Merchant's Account ID
	        // Merchant's Secret Key
	        // Transaction Mode: TEST (can also be LIVE)
	    BluePayPayment_BP10Emu stq = new BluePayPayment_BP10Emu(
	        ACCOUNT_ID,
	        SECRET_KEY,
	        MODE);
	     
	    // Report Start Date: Jan. 1, 2013
	    // Report End Date: Jan. 15, 2013
	    // Do not include errored transactions? Yes
	    stq.getSingleTransQuery(
	        "2013-01-01",
	        "2016-03-15",
	        "1");
	   
	    // Query by a specific Transaction ID
	    stq.queryByTransactionID("100223103854");
	    try {
	      stq.process();
	      // Outputs response from BluePay gateway
	      System.out.println(stq.getResponse());
	    } catch (Exception ex) {
	      System.out.println("Exception: " + ex.toString());
	      System.exit(1);
	    }
	  }
	}