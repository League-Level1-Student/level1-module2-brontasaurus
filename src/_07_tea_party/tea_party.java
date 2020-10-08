package _07_tea_party;

public class tea_party {

	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        
	    	if(!isWoman) {
	    		if(!isKnighted) {
	    			return "Hello Mr. "+ name;
	    		}
	    		else if(isKnighted){
	    			return "Hello Sir "+ name;
	    		}
	    	}
	    	else if(!isKnighted){
	    		return "Hello Ms. "+ name;
	    	}
	    	else{
	    		return "Hello Lady "+ name;
	    	}
	    }
	}


