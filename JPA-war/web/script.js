/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function showT(value){
    if(value==='student'){
        document.getElementById('classTable').style.display="none";
        document.getElementById('relationsTable').style.display="none";
        document.getElementById('studentTable').style.display="block";
    } else if(value==='class'){
        document.getElementById('studentTable').style.display="none";
        document.getElementById('relationsTable').style.display="none";
        document.getElementById('classTable').style.display="block";
    } else if(value==='relation'){
        document.getElementById('studentTable').style.display="none";
        document.getElementById('classTable').style.display="none";
        document.getElementById('relationsTable').style.display="block";
    }
}
