define(['router/app-router', 'view/app-view', 'json2']
        , function(AppRouter, AppView){
    
    // Send to the server all warn or error logs
    console.level = 'warn';
    
    new AppView({root: $('#todoapp')});
    new AppRouter();
    
});


/*

define(['router/app-router'], function(AppRouter) {
    new AppRouter();
    // ...
});

*/