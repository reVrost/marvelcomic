package com.marvelcomic;

import java.util.ArrayList;

import com.marvelcomic.model.Comic;
import com.marvelcomic.repository.CachedRepository;
import com.marvelcomic.repository.ComicRepository;
import com.marvelcomic.repository.Repositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public ErrorResult getMain() {

        return new ErrorResult(404, "Endpoint Not Implemented");
    }

    @RequestMapping(value="/comics", headers="Accept=application/json")
    public ArrayList<Comic> comics(@RequestParam(value="comicIds") String comicIds) {
        String[] ids = comicIds.split(",");

        ArrayList<Comic> comics = new ArrayList<Comic>();

        CachedRepository<Comic> repo = Repositories.GetComicRepository();

        for (String id : ids) {
            Comic item = repo.get(id);
            if (item != null)
                comics.add(item);
        }

        return comics;
    }
}