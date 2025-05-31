package demo.demo.controller;


import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/songs")
@CrossOrigin(origins = "*")
public class NanbanMusicController {

	
//   / private final Path musicDirectory = Paths.get("src/main/resources/static/songs/nanban");

    @GetMapping("/nanban")
    public ResponseEntity<List<String>> listNanbanSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/nanban");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/nanban/{filename}")
    public ResponseEntity<Resource> getNanbanSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/nanban");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/NaalaiyaTheerpu")
    public ResponseEntity<List<String>> listNaalaiyaTheerpuSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Naalaiya Theerpu");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/NaalaiyaTheerpu/{filename}")
    public ResponseEntity<Resource> getNaalaiyaTheerpuSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Naalaiya Theerpu");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/GOAT")
    public ResponseEntity<List<String>> listGOATSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/GOAT");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/GOAT/{filename}")
    public ResponseEntity<Resource> getGOATSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/GOAT");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Leo")
    public ResponseEntity<List<String>> listLeoSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Leo");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Leo/{filename}")
    public ResponseEntity<Resource> getLeoSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Leo");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Varisu")
    public ResponseEntity<List<String>> listVarisuSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Varisu");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Varisu/{filename}")
    public ResponseEntity<Resource> getVarisuSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Varisu");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/beast")
    public ResponseEntity<List<String>> listbeastSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/beast");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/beast/{filename}")
    public ResponseEntity<Resource> getbeastSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/beast");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/master")
    public ResponseEntity<List<String>> listmasterSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/master");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/master/{filename}")
    public ResponseEntity<Resource> getmasterSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/master");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Bigil")
    public ResponseEntity<List<String>> listBigilSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Bigil");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Bigil/{filename}")
    public ResponseEntity<Resource> getBigilSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Bigil");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Sarkar")
    public ResponseEntity<List<String>> listSarkarSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/sarkar");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Sarkar/{filename}")
    public ResponseEntity<Resource> getSarkarSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/sarkar");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Mersal")
    public ResponseEntity<List<String>> listMersalSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Mersal");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Mersal/{filename}")
    public ResponseEntity<Resource> getMersalSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Mersal");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Bairava")
    public ResponseEntity<List<String>> listBairavaSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Bairava");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Bairava/{filename}")
    public ResponseEntity<Resource> getBairavaSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Bairava");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Theri")
    public ResponseEntity<List<String>> listTheriSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Theri");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Theri/{filename}")
    public ResponseEntity<Resource> getTheriSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Theri");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Puli")
    public ResponseEntity<List<String>> listPuliSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Puli");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Puli/{filename}")
    public ResponseEntity<Resource> getPuliSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Puli");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/kaththi")
    public ResponseEntity<List<String>> listkaththiSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/kathi");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/kaththi/{filename}")
    public ResponseEntity<Resource> getkaththiSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/kathi");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Thalaiva")
    public ResponseEntity<List<String>> listThalaivaSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/thalaiva");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Thalaiva/{filename}")
    public ResponseEntity<Resource> getThalaivaSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/thalaiva");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Thuppakki")
    public ResponseEntity<List<String>> listThuppakkiSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Thuppakki");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Thuppakki/{filename}")
    public ResponseEntity<Resource> getThuppakkiSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Thuppakki");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Velayudham")
    public ResponseEntity<List<String>> listVelayudhamSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Velayudham");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Velayudham/{filename}")
    public ResponseEntity<Resource> getVelayudhamSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Velayudham");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/Kaavalan")
    public ResponseEntity<List<String>> listKaavalanSongs() {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Kaavalan");
        try {
            List<String> songs = Files.list(musicDirectory)
                    .filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .collect(Collectors.toList());
            return ResponseEntity.ok(songs);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.emptyList());
        }
    }

    @GetMapping("/Kaavalan/{filename}")
    public ResponseEntity<Resource> getKaavalanSong(@PathVariable String filename) {
    	Path musicDirectory = Paths.get("src/main/resources/static/songs/Kaavalan");

        try {
        	
            Path filePath = musicDirectory.resolve(filename).normalize();
            
            System.out.println("Looking for file: " + filePath.toString());
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_TYPE, "audio/flac")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
