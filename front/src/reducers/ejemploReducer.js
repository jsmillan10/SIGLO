const INITIAL_STATE = {
    myBoolean: false,
}

export default (state = INITIAL_STATE, action) =>{
    switch (action.type){
        case 'CAMBIAR_ESTADO':
            return {...state, myBoolean: action.payload}
        default: return {...state}
    }
}