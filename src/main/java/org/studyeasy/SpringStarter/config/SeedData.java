package org.studyeasy.SpringStarter.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.studyeasy.SpringStarter.Services.PostService;
import org.studyeasy.SpringStarter.models.Post;

@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    private PostService postService;
    @Override
    public void run(String... args) throws Exception {
     
        List<Post> post= postService.getAll();

        if(post.size() == 0){

            Post post01 = new Post(); 
            post01.setTitle("post 01");
            post01.setBody("Post Body 01.....");
         
            postService.save(post01);


            
            Post post02 = new Post(); 
            post02.setTitle("post 02");
            post02.setBody("Post Body 02.....");
         
            postService.save(post02);
        }
     
    }

    
    
}
