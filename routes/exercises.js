/**
 * Created by Lukas on 17-07-2016.
 */
var express = require('express');
var router = express.Router();

/* GET home page. */

[1, 2, 3].forEach((current, index) => {
    router.get('/day-' + current, function(req, res, next) {
        res.render('exercises/day-' + current, { title: 'Day ' + current});
    });
});

module.exports = router;
