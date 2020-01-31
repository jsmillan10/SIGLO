import React, { Component } from 'react';
import * as ejemploAction from '../actions/ejemploAction'
import {connect} from 'react-redux'

class Inicio extends Component {

    cambiarEstado = ()=>{
        this.props.cambiarBooleano(!this.props.myBoolean) //este es el nombre de la funcion en el action
    }
  render() {
    return (
      <div>
          <div style={{color:'white'}}>El valor es: {this.props.myBoolean?'True':'False'}</div>
          <br/>
          <button onClick={()=>this.cambiarEstado()}>Cambiar Estado</button>
      </div>
    );
  }
}

const mapStateToProps = (reducers) =>{
  return reducers.ejemploReducer
}

export default connect(mapStateToProps, ejemploAction)(Inicio)
