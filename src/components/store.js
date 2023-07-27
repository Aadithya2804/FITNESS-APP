import { createStore } from "redux";

const intialState={
    user: null,
};

const reducer=(state=intialState,action)=>{
    switch (action.type){
        case 'LOGIN':
            return{
                ...state,
                user:action.payload,
            };
            default:
                return state;
    }
};
const store=createStore(reducer);



export default store;