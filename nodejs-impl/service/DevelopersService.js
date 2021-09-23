'use strict';


/**
 * adds task
 * Adds a task to the system
 *
 * body Task Inventory item to add (optional)
 * no response value expected for this operation
 **/
exports.addTask = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * searches tasks from the database
 * By passing in the appropriate options, you can search for available task in the system 
 *
 * searchString String pass an optional search string for looking up task (optional)
 * projectName String pass project name to lookup a task from project (optional)
 * returns List
 **/
exports.searchTask = function(searchString,projectName) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "name" : "Conduct AWS Session",
  "project" : {
    "name" : "AWS Demo",
    "description" : "Project to track tasks for AWS Demo"
  },
  "priority" : "High",
  "completeDate" : "2016-08-29T09:12:33.001Z"
}, {
  "name" : "Conduct AWS Session",
  "project" : {
    "name" : "AWS Demo",
    "description" : "Project to track tasks for AWS Demo"
  },
  "priority" : "High",
  "completeDate" : "2016-08-29T09:12:33.001Z"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

