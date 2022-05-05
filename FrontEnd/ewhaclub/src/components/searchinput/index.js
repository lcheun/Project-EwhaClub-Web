import React, { useState } from "react";
import searchicon from "asset/search.png";
import style from "styled-components";
import { colors, fonts, BORDER_RADIUS_3 } from "styles/styleObj";

const SearchInput = () => {
  const [input, setInput] = useState("");
  const onChange = (event) => {
    console.log("onChange");

    const {
      target: { value },
    } = event;
    setInput(value);
  };

  const onSubmit = (event) => {
    event.preventDefault();
    console.log("onSubmit");
    console.log(input);
  };
  return (
    <>
      <SearchForm onSubmit={onSubmit}>
        <img src={searchicon} onClick={onSubmit} alt="searchImg" />
        <input
          value={input}
          onChange={onChange}
          type="text"
          placeholder="벗들이 원하는 동아리가 있나요?"
        />
      </SearchForm>
    </>
  );
};

export default SearchInput;

const SearchForm = style.form`     
display: flex;
flex-direction:row;
text-align: center;
margin: 0 auto;
width:60%;
height:44px;
border-radius:${BORDER_RADIUS_3};
border : 1px solid ${colors.green.ewha};
padding:5px 10px;
input{
width:100%;
    outline: none;
  border:1px solid ${colors.white.origin};
  border-radius:${BORDER_RADIUS_3};
    color:${colors.green.ewha};
    font-size:${fonts.size.regular};
    font-weight:${fonts.weight.regular};
   
}
img{
object-fit:none;
}



`;
