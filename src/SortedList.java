
public class SortedList {
    
    private ListHouse house; 
	private SortedList next_house; 
	private SortedList starter_house; 
	private int no_of_items; 
	private SortedList current_house_Pos; 
	
	 //initialize values
	  public SortedList()	
                 { 
		  no_of_items = 0;
		  starter_house = null;
		  current_house_Pos = null;
                 } 
	

	//insert
	  public void insert (ListHouse item) 
		 {
		  SortedList newNode = new SortedList(); 
		  SortedList backer = new SortedList(); 
		  SortedList position = new SortedList();
		  position = starter_house;
			  backer = null;
			  boolean moreToSearch = (position != null);

		    while (moreToSearch) 
		    {
		    	switch (item.compareTo(position.house)) {
				case "Less":
					 moreToSearch = false;
					break;

				default:
					backer = position;
					position = position.next_house;
					moreToSearch = (position != null);
					break;
				}		    	

		    }
//             
			  newNode.house = (ListHouse)item.copy();
			  if (backer == null)				  
			  {
			  newNode.next_house = starter_house;
			  starter_house = newNode;
			  }
			  else
			  {
			  newNode.next_house = position;
	  		  backer.next_house = newNode;
			  }
//			  
			  no_of_items++;
			  System.out.println(current_house_Pos);
		  }
	  //deletion
	  public void delete (ListHouse item)	 
                  {			
		     SortedList position = starter_house;
		     switch (item.compareTo(position.house)) {
			case "Equal":
				starter_house = starter_house.next_house; 
				break;
			default:
				    while (!item.compareTo(position.next_house.house).equalsIgnoreCase("Equal"))
					position = position.next_house;
					position.next_house = position.next_house.next_house;
				break;
			}
			no_of_items--;
			if(no_of_items ==0){flag = "o";}
			else{flag = "l";}
                  }
	  
	    String flag = "l";
          //allocateitems
		public Listable getNextItem ()
                { 
			
			System.out.println(current_house_Pos);
			if(no_of_items ==1 && flag=="o")
			{                          
			if (current_house_Pos.next_house == null)
			current_house_Pos  = starter_house;
			}
			Listable nextItem = current_house_Pos.house.copy();
			if (current_house_Pos.next_house == null)
			current_house_Pos = starter_house;
			else
			current_house_Pos = current_house_Pos.next_house;
			return nextItem;
		}
		
		//fetching
		  public Listable Fetcher(ListHouse item)  
		  		  {
			  SortedList position = starter_house;
			  boolean found = false;
			  while (!found)
			  {
			  if (item.compareTo(position.house).equalsIgnoreCase("Equal")) 
			  found = true;
			  else
			  position = position.next_house;
			  }
			  return position.house.copy();
		  }
		  
	//checking availability 
	public boolean availability(ListHouse item) {
		 
		  boolean moreToSearch;
		  SortedList position = starter_house;
		  boolean found = false;
		  moreToSearch = (position != null);
		  while (moreToSearch && !found)
		  {
		  switch (item.compareTo(position.house)) {
			case "Equal":
				found = true;
				break;
				
			case "Less":
				moreToSearch = false;
				break;

			default:
				  position = position.next_house;
				  moreToSearch = (position != null);
				break;
			}			
		}

		return found; 
	}

	  
	  public void reset()
                {
		  if(no_of_items != 0)
		  current_house_Pos = starter_house;
                }
	  
	  public int lengthIs()
	
                {
                  return no_of_items;
                }
	  
	  public SortedList getCurrent()
                {
		  return current_house_Pos; 
                }
    
}
