package com.test.commanFuncations;

public enum Dropdown {
	
	INDEX {
		@Override 
		public String toString()
		{
			return "index";
		}
	},
	VALUE
	{
		@Override
		public String toString()
		{
			return "value";
					
		}
	},
	VISIBLEBYTEXT
	{
		public String toString()
		{
			return "visibleText";
		}
	}

}
