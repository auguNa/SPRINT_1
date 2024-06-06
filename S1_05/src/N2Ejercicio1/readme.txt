To run the FolderLister program from the command line, follow these steps:

    1. Comment the lines  from Main.java & FolderLister file (//package S1_05.N2Ejercicio1;)

    2. Open a new Command Prompt window
    3. Navigate to the root directory of the project: cd 'project_root'
    4. Open 'confing.properties' file and modify:
             input.directory= C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy  --> your absolute folder path that want to be processed
             output.file.path= C:\\Users\\augus\\Desktop\\BCN ACTIVA\\ITAcademy\\SPRINT1A\\src\\S1_05\\N2Ejercicio1\\directory_tree.txt --> the path where directory_tree.txt should be saved.
    5. Compile the Java source file: javac Main.java
    6. Run the compiled program java Main
    7. The program will generate a directory_tree.txt file.

   