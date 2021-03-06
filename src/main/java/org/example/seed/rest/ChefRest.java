package org.example.seed.rest;

import org.example.seed.event.chef.CatalogChefEvent;
import org.example.seed.event.chef.CreateChefEvent;
import org.example.seed.event.chef.ResponseChefEvent;
import org.example.seed.event.chef.UpdateChefEvent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * Created by PINA on 15/06/2017.
 */
@RequestMapping(path = "/chefs")
public interface ChefRest {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Callable<CatalogChefEvent> getChefs(final int page, final int limit) throws ExecutionException, InterruptedException;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    Callable<ResponseChefEvent> createChef(final CreateChefEvent event) throws ExecutionException, InterruptedException;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    Callable<ResponseChefEvent> getChef(final String id) throws ExecutionException, InterruptedException;

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    Callable<ResponseChefEvent> updateChef(final UpdateChefEvent event) throws ExecutionException, InterruptedException;

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    Callable<ResponseChefEvent> deleteChef(final String id) throws ExecutionException, InterruptedException;
}
