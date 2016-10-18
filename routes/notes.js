/**
 * Created by Lukas on 17-07-2016.
 */
var express = require('express');
var router = express.Router();

/* GET home page. */
[1, 2, 3, 4, 5, 7, 22].forEach((current, index) => {
    router.get('/day-' + current, function(req, res, next) {
        res.render('notes/day-' + current, { title: 'Day ' + current});
    });
});


/**
[1, 2, 3, 4, 5].forEach((current, index) => {
    router.get('/assignment-' + current, function(req, res, next) {
        res.render('notes/assignment-' + current, { title: 'Assignment ' + current });
    });
});
**/
module.exports = router;
