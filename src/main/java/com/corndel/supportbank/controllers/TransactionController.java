package com.corndel.supportbank.controllers;

import com.corndel.supportbank.services.ListService;
import com.corndel.supportbank.services.SummariseService;
import picocli.CommandLine.Command;

@Command(name = "currency", subcommands = {SummariseService.class, ListService.class})
public class TransactionController {
}
