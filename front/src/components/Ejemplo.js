import React, { Component } from 'react';
import * as ejemploAction from '../actions/ejemploAction'
import {connect} from 'react-redux'

class Inicio extends Component {

    cambiarEstado = ()=>{
        this.props.cambiarBooleano() //este es el nombre de la funcion en el action
    }
  render() {
    return (
      <div>
          <div>{this.props.myBoolean}</div>
          <br/><br/>
          <button>Cambiar Estado</button>
      </div>
    );
  }
}

const mapStateToProps = (reducers) =>{
  return reducers.ejemploReducer
}

export default connect(mapStateToProps, ejemploAction)(Inicio)
