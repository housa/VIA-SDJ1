/**
 * Created by Lukas on 17-07-2016.
 */
var express = require('express');
var router = express.Router();

/* GET home page. */

[1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28, 29].forEach((current, index) => {
    router.get('/day-' + current, function(req, res, next) {
        res.render('exercises/day-' + current, { title: 'Day ' + current});
    });
});

[1, 2].forEach((current, index) => {
    router.get('/hand-in-' + current, function(req, res, next) {
        res.render('exercises/hand-in-' + current, { title: 'Day ' + current});
    });
});

[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11].forEach((current, index) => {
    router.get('/code-example-' + current, function(req, res, next) {
        res.render('examples/code-example-' + current, { title: 'Day ' + current});
    });
});



module.exports = router;
