package com.halobyte.menuservices.util;

import java.util.List;

import com.halobyte.menuservices.model.MenuItem;

public class SimpleMenuStructureStrategy implements MenuStructureStratey
{
	private static final String menu = "[ {\"children\" : [ {\"children\" : [ {\"text\" : \"ENG-16\"}, {\"text\" : \"Route Builder\",\"url\" : \"https://www.google.com\"} ],\"text\" : \"Engineering\" }, {\"children\" : [ {\"text\" : \"INV-16\" }, { \"text\" : \"PSA\"} ],\"text\" : \"Inventory\" }, {\"children\" : [ {\"children\" : [ {\"text\" : \"Groups\"}, { \"children\" : [ {\"text\" : \"Unlock\",\"url\" : \"http://www.yahoo.com\" }, {\"text\" : \"Add\",\"url\" : \"http://www.aol.com\" } ],\"text\" : \"Users\",\"url\" : \"http://www.msn.com\"}, {\"text\" : \"Permissions\"} ], \"text\" : \"CONOPS\"}, { \"text\" : \"MRO\" } ], \"text\" : \"Administration\" }, {\"children\" : [ { \"children\" : [ {\"text\" : \"Requisition Maintenance\",\"url\" : \"http://espn.go\" } ],\"text\" : \"MPTSTP\"} ],\"text\" : \"Purchasing\"} ],\"text\" : \"home\"} ]";

	public String buildMenu( List<MenuItem> menuItems )
	{
		return menu;
	}

}
