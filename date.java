public String[] caldate(String A,String B)
	    {
	    	String[] date=new String[3];
	    	date[1]=A;
	    	date[2]=B;
	    	String [] dateParts1 = date[1].split(".");
	    	int day1 = Integer.parseInt(dateParts1[0]);
	    	int month1 = Integer.parseInt(dateParts1[1]);
	    	int year1 = Integer.parseInt(dateParts1[2]);
	    	day1 = 1;
	    	String [] dateParts = date[2].split(".");
	    	int day = Integer.parseInt(dateParts[0]);
	    	int month = Integer.parseInt(dateParts[1]);
	    	int year = Integer.parseInt(dateParts[2]);
	    	//Calendar cal = Calendar.getInstance();
	    	//cal.setTime(date2);
	    	//int year = cal.get(Calendar.YEAR);
	    	//int month = cal.get(Calendar.MONTH) + 1;
	    	//int day = cal.get(Calendar.DAY_OF_MONTH);
	    	int x;
	    	if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
	            	//System.out.println("LEAP YEAR");
	    		x=1;
	    	    } 
	    	else {
	            	//System.out.println("NOT A LEAP YEAR");
	    		x=0;
	        	}
	    	switch(month){
	    	case 1://cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;
	    	case 2:
	    		if(x == 1)
	    		{
	    			day=29;break;
	    			//cal.set(Calender.DAY_OF_MONTH,29);
	    		}
	    		else{
	    			day=28;
	    		}
	    	case 3: //cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;
	     	case 4: //cal.set(Calender.DAY_OF_MONTH,30);break;
	    		day=30;
	    		break;
	    	case 5: //cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;
	    	case 6:// cal.set(Calender.DAY_OF_MONTH,30);break;
	    		day=30;
	    		break;
	    	case 7: //cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;
	    	case 8: //cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;	
	    	case 9: //cal.set(Calender.DAY_OF_MONTH,30);break;
	    		day=30;
	    		break;	
	    	case 10: //cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;
	    	case 11: //cal.set(Calender.DAY_OF_MONTH,30);break;
	    		day=30;
	    		break;
	    	case 12: //cal.set(Calender.DAY_OF_MONTH,31);break;
	    		day=31;
	    		break;
	    	default: System.out.println("Invalid month");
	    	}
	    	date[1] = Integer.toString(day1) + Integer.toString(month1) + Integer.toString(year1);
	    	date[2] = Integer.toString(day) + Integer.toString(month) + Integer.toString(year);	    	
	    	return date;
	    }