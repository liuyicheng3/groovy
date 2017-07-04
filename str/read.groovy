new File("praise.txt").eachLine { 
	if (it) {
		    def temp= it.toUpperCase().replace("XX","""\$s""");
		    def item= "<item>${temp} </item> \n";

		    new File("foo.txt").append("$item");
	}
}