import Dashboard from 'pages/Dashboard';
import Home from 'pages/Home';
import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
//Arquivos de rotas das páginas
const Routes = () => {

    return (

        <BrowserRouter> 
            <Switch>
                <Route path="/" exact> 
                    <Home />
                </Route>
                <Route path="/dashboard"> 
                    <Dashboard />
                </Route>
            </Switch>
        </BrowserRouter>
    );

}

export default Routes;