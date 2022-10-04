package commm;

public class Mad {
	String B1 = "Mad";
	String B2 = "Mad";
	String B3 = "Stable";
	String B4 = "Mad";
	String O1 = "Mad";
	String O2 = "Stable";
	String O3 = "Mad";
	String O4 = "Mad";
	void verify()
	{
		if(B1=="Mad") 
		{
			//continue;
			System.out.println(B1);
			if(B2=="Mad")
			{
				System.out.println(B2);
				if(B3=="Stable")
				{
					System.out.println(B3);
					if(B4=="Mad")
					{
						System.out.println(B4);
						if(O1=="Mad")
						{
							System.out.println(O1);
							if(O2=="Stable")
							{
								System.out.println(O2);
								if(O3=="Mad")
								{
									System.out.println(O3);
									if(O4=="Mad")
									{
										System.out.println(O4);
									}
								}
							}
						}
					}
				}
			}
		}
		/*
		 * else if(B2=="Stable") { System.out.println(B2); } else if(B3=="Stable") {
		 * System.out.println(B3); } else if(B4=="Stable") { System.out.println(B4); }
		 * else if(O1=="Stable") { System.out.println(O1); } else if(O2=="Stable") {
		 * System.out.println(O2); } else if(O3=="Stable") { System.out.println(O3); }
		 * else if(O4=="Stable") { System.out.println(O4); }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String B1 = "Mad"; String B2 = "Mad"; String B3 = "Stable"; String B4 =
		 * "Mad"; String O1 = "Mad"; String O2 = "Stable"; String O3 = "Mad"; String O4
		 * = "Mad";
		 */
		Mad M1 = new Mad();
		M1.verify();

	}

}
