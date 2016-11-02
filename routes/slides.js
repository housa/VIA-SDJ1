/**
 * Created by Lukas on 17-07-2016.
 */
var express = require('express');
var router = express.Router();

/* GET home page. */

[1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 14, 15, 16, 18, 19, 20, 23, 24, 25, 26, 27].forEach((current, index) => {
    router.get('/day-' + current, function(req, res, next) {
        res.render('slides/day-' + current, { title: 'Day ' + current });
    });
});

[1].forEach((current, index) => {
    router.get('/test-' + current + '-recap', function(req, res, next) {
        res.render('slides/test-' + current + '-recap', { title: 'Day ' + current });
    });
});

module.exports = router;
