def count = 0
File dir = new File("./origin")

dir.eachFile{oldFilename->
	count++;
	println("$oldFilename");
	new File("$oldFilename").renameTo(new File("$oldFilename"+count));
}


