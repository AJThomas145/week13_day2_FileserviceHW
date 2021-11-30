package com.codeclan.day2HW.Fileservice.components;

import com.codeclan.day2HW.Fileservice.models.File;
import com.codeclan.day2HW.Fileservice.models.Folder;
import com.codeclan.day2HW.Fileservice.models.User;
import com.codeclan.day2HW.Fileservice.repositories.FileRepository;
import com.codeclan.day2HW.Fileservice.repositories.FolderRepository;
import com.codeclan.day2HW.Fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Andrew Thomas");
        userRepository.save(user1);

        User user2 = new User("Simon Crossan");
        userRepository.save(user2);

        Folder folder1 = new Folder("Python Project", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("java Project", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("JS Project", user1);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("CodeClan Project", user2);
        folderRepository.save(folder4);

        File file1 = new File("Python file info", "txt", 20, folder1);
        fileRepository.save(file1);

        File file5 = new File("Structure", "rb", 115, folder1);
        fileRepository.save(file5);

        File file2 = new File("Java file info", "java", 30, folder2);
        fileRepository.save(file2);

        File file6 = new File("GitHub info", "pdf", 98, folder2);
        fileRepository.save(file6);

        File file3 = new File("JS file info", "txt", 17, folder3);
        fileRepository.save(file3);

        File file4 = new File("CodeCLan file info", "ppt", 200, folder4);
        fileRepository.save(file4);
    }
}
