
export const cambiarBooleano = (estado) => (dispatch) =>{
  dispatch({
    type: 'CAMBIAR_ESTADO',
    payload: estado
  })
}

//Aqui se agregan las demas actions, estas actions son funciones que se comunican con los reducer