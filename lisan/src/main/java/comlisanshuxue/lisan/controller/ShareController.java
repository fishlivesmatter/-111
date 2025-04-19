package comlisanshuxue.lisan.controller;

import comlisanshuxue.lisan.entity.SharedData;
import comlisanshuxue.lisan.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/share")
public class ShareController {
    @Autowired
    private ShareService shareService;

    @PostMapping
    public Long createShare(@RequestBody String content) {
        return shareService.saveSharedData(content);
    }

    @GetMapping("/{id}")
    public SharedData getShare(@PathVariable Long id) {
        return shareService.getSharedData(id);
    }
}