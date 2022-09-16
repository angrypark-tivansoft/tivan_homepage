<template>
    <div class="wrap">



        <link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/notosanskannada.css">
        <link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/notosanskannadaui.css">

      <form id="contact-form">
        <input type="hidden" name="contact_number" value=""/>
        <input type="hidden" name="user_name" value=""/>
        <input type="hidden" name="from_name" value=""/>
        <input type="hidden" name="message_html" value=""/>
      </form>
      <!-- <h1><img src="/web_images/logo.png"></h1> -->


        <div id="base" class="">

          <!-- Unnamed (Rectangle) -->
          <div id="u0" class="ax_default box_2">
            <div id="u0_div" class=""></div>
            <div id="u0_text" class="text " style="display:none; visibility: hidden">
              <p></p>
            </div>
          </div>

          <!-- Unnamed (Image) -->
          <div id="u1" class="ax_default image">
            <img id="u1_img" class="img " src="@/assets/ewlogo.png"/>
            <div id="u1_text" class="text " style="display:none; visibility: hidden">
              <p></p>
            </div>
          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u2" class="ax_default heading_2">
            <div id="u2_div" class=""></div>
            <div id="u2_text" class="text ">
              <p><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">기업의</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span></p><p><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">비즈니스</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">가치와</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">연속성을</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">위한</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span></p><p><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">플랫폼</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">구축</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">!</span></p><p><span style="font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;font-weight:700;"><br></span></p><p><span style="font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;font-weight:700;">티반소프트</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">가</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"> </span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">함께합니다</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">.</span></p>
            </div>
          </div>
          <!-- Unnamed (Rectangle) -->
          <div id="u3" class="ax_default heading_1">
            <div id="u3_div" class=""></div>
            <div id="u3_text" class="text ">
              <p><span>무엇이든 물어보세요. </span><span>혹</span><span>시 답변이 </span><span>오</span><span>지않으면, </span><span>스</span><span>팸메일함을 확</span><span>인</span><span>해 주세요.</span></p>
            </div>
          </div>

          <!-- Unnamed (Text Field) -->
          <div id="u4" class="ax_default text_field">
            <div id="u4_div" class="" style="width: 0px;"></div>
            <input v-bind:value="mail"  v-on:input="updateMail" style="width: 750px;" placeholder="&nbsp;&nbsp;&nbsp; 이메일을 입력해 주세요" class="u4_input"/>
          </div>
          <!-- Unnamed (Text Area) -->
          <div id="u5" class="ax_default text_area">
            <div id="u5_div" class="" style="width: 0px;"></div>
            <textarea  v-bind:value="msg"  v-on:input="updateMsg" class="u5_input"  placeholder="&nbsp;&nbsp;&nbsp;&nbsp;내용을 적어주세요." style="width: 750px;"></textarea>
          </div>

          <!-- Unnamed (Checkbox) -->

            <div id="u6" class="ax_default checkbox">
            <label id="u6_input_label" for="u6_input" style="position: absolute; left: 0px;"></label>


            <div class="form-check">
              <input class="form-check-input" type="checkbox" v-model="infoProvYn" true-value="Y" false-value="N">
              <label class="form-check-label checkbox-text" for="infoProvYn">
                <strong>이메일 정보 제공 동의</strong><br>
              </label>
            </div>


          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u7" class="ax_default paragraph">
            <div id="u7_div" class=""></div>
            <div id="u7_text" class="text ">
              <p><span>질문의 답변을 위해 이메일제공에 동의해 주시기 바랍니다.</span></p>
            </div>
          </div>


          <div id="u8" class="ax_default droplist">
            <div id="u8_div" class=""></div>
            <select id="u8_input" v-model="msgType" class="u8_input">
              <option class="u8_input_option" value="">&nbsp; 질문유형을 선택해주세요.</option>
              <option class="u8_input_option" value="제휴/협력">제휴/협력</option>
              <option class="u8_input_option" value="인력플랫폼 이용안내">인력플랫폼 이용안내</option>
              <option class="u8_input_option" value="기타">기타</option>
            </select>
          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u9" class="ax_default heading_2">
            <div id="u9_div" class=""></div>
            <div id="u9_text" class="text ">
              <p style="font-size:20px;"><span>티반소프트</span><span> </span></p><p style="font-size:16px;"><span style="font-size:20px;">&nbsp;</span><span>&nbsp; </span><span>인력아웃소싱</span><span> </span><span>플랫폼</span><span>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; </span></p><p style="font-size:16px;"><span>&nbsp;&nbsp; </span><span>시공프로젝트</span><span> </span><span>관리</span><span> </span><span>플랫폼</span></p><p style="font-size:16px;"><span><br></span></p><p style="font-size:16px;"><span><br></span></p><p style="font-size:20px;"><span>스트릭스</span><span> </span></p><p style="font-size:16px;"><span style="font-size:20px;">&nbsp;</span><span>&nbsp;&nbsp; </span><span>에너지</span><span> </span><span>전력중개</span><span> </span><span>플랫폼</span><span>&nbsp; &nbsp;&nbsp; </span></p><p style="font-size:16px;"><span>&nbsp;</span></p><p style="font-size:20px;"><span><br></span></p><p style="font-size:20px;"><span>주식회사</span><span> </span><span>스윙크</span><span> </span></p><p style="font-size:16px;"><span style="font-size:20px;">&nbsp;</span><span>&nbsp;&nbsp; </span><span>오원트밸런스</span><span> </span><span>보험전문가</span><span>&nbsp; &nbsp; </span></p><p style="font-size:16px;"><span><br></span></p><p style="font-size:16px;"><span><br></span></p><p style="font-size:20px;"><span>미얀마</span><span> </span><span>한국어학아카데미</span><span> </span></p><p style="font-size:16px;"><span style="font-size:20px;">&nbsp;</span><span>&nbsp;&nbsp; </span><span>어학아카데미</span><span> </span><span>플랫폼</span><span>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; </span></p><p style="font-size:16px;"><span>&nbsp;&nbsp;&nbsp; </span><span>인력소개</span><span> </span><span>플랫폼</span><span>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; </span></p><p style="font-size:16px;"><span><br></span></p>
            </div>
          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u10" class="ax_default heading_2">
            <div id="u10_div" class=""></div>
            <div id="u10_text" class="text ">
              <p><span>[플랫폼 구축]</span></p>
            </div>
          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u11" class="ax_default heading_2">
            <div id="u11_div" class=""></div>
            <div id="u11_text" class="text ">
              <p style="font-size:20px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">KB국민은행</span><span style="font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;font-weight:700;"> </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;font-size:20px;">&nbsp;</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">&nbsp; 비대면채널 앱 리브똑똑, 리브 </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">&nbsp;&nbsp; 부동산 플랫폼 서비스 리브온</span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"><br></span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"><br></span></p><p style="font-size:20px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">KEB 하나은행 </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;font-size:20px;">&nbsp;</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">&nbsp; 비대면채널 앱&nbsp; 하나 1</span><span style="font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;font-weight:400;">Q</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">뱅킹&nbsp; &nbsp; </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"><br></span></p><p style="font-size:20px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">티머니 </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;font-size:20px;">&nbsp;</span><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;">&nbsp;&nbsp; 티머니 모바일 운영&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; </span></p><p style="font-size:16px;"><span style="font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;font-weight:200;"><br></span></p>
            </div>
          </div>
          <!-- Unnamed (Rectangle) -->
          <div id="u12" class="ax_default heading_2">
            <div id="u12_div" class=""></div>
            <div id="u12_text" class="text ">
              <p><span>[디지털금융 SI 및 SM 아웃소싱]</span></p>
            </div>
          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u13" class="ax_default heading_2">
            <div id="u13_div" class=""></div>
            <div id="u13_text" class="text ">
              <p><span>주요사업</span></p>
            </div>
          </div>

          <!-- Unnamed (Line) -->
          <div id="u14" class="ax_default line">
            <img id="u14_img" class="img " src="@/assets/u14.svg"/>
            <div id="u14_text" class="text " style="display:none; visibility: hidden">
              <p></p>
            </div>
          </div>

          <!-- Unnamed (Rectangle) -->
          <div id="u15" class="ax_default heading_2">
            <div id="u15_div" class=""></div>
            <div id="u15_text" class="text ">
              <p><span>고객문의</span></p>
            </div>
          </div>

          <!-- Unnamed (Line) -->
          <div id="u16" class="ax_default line">
            <img id="u16_img" class="img " src="@/assets/u14.svg"/>
            <div id="u16_text" class="text " style="display:none; visibility: hidden">
              <p></p>
            </div>
          </div>

          <!-- Unnamed (Rectangle) -->
          <!-- <div id="u17" class="ax_default box_1">
            <div id="u17_div" class=""></div>
            <div id="u17_text" class="text ">
              <p><span>+ </span><span>더보기</span></p>
            </div>
          </div> -->

          <!-- Unnamed (Rectangle) -->
          <div id="u17" class="ax_default box_1">
            <div id="u17_div" class=""></div>
            <div id="u17_text" class="text ">
              <p style="text-align:center; cursor: pointer;"  @click="getSend" ><span >문의하기</span></p>
            </div>
          </div>
        </div>





    </div>
</template>

<script>
    import sendmail from '@/api/sendmail';
    export default {
        name: 'home',
        components : {

        },
      data() {
        return  {
          common: []
        }
      },
      created() {

      },

      methods: {
        getSend: function(){

          if(this.mail == null ||  this.mail == ""){
            alert("이메일 정보는 필수입니다.");
            return;
          }
          if(this.msg == null ||  this.msg == ""){
            alert("내용을 입력해주십시오.");
            return;
          }

          if(this.infoProvYn != "Y"){
            alert("이메일 정보동의는 필수입니다.");
            return;
          }
          var msgType = "기타";
          if(this.msgType != null &&  this.msgType != ""){
            msgType = this.msgType;
          }
          const data = {
            to : this.mail,
            msgType: msgType,
            msg: this.msg,
          }
          sendmail.getSenmail(data).then(response => {
            console.log(JSON.stringify(response.data));
            alert("전송되었습니다.");
          });

        },

        updateMail: function(event){
          var updateMail = event.target.value;
          this.mail = updateMail;
        },
        updateMsg: function(event){
          var updateMsg = event.target.value;
          this.msg = updateMsg;
        }
      }
    }

</script>
<style>
/* so the window resize fires within a frame in IE7 */
/* so the window resize fires within a frame in IE7 */
html, body {
  height: 100%;
}

.mobileFrameCursor div * {
  cursor: inherit !important;
}

a {
  color: inherit;
}

p {
  margin: 0px;
  text-rendering: optimizeLegibility;
  font-feature-settings: "kern" 1;
  -webkit-font-feature-settings: "kern";
  -moz-font-feature-settings: "kern";
  -moz-font-feature-settings: "kern=1";
  font-kerning: normal;
}

ul {
  margin:0px;
}

iframe {
  background: #FFFFFF;
}

/* to match IE with C, FF */
input {
  padding: 1px 0px 1px 0px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
}

input[type=text]::-ms-clear {
  width: 0;
  height: 0;
  display: none;
}

textarea {
  margin: 0px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
}

.focused:focus, .selectedFocused:focus {
  outline: none;
}

div.intcases {
  font-family: arial;
  font-size: 12px;
  text-align:left;
  border:1px solid #AAA;
  background:#FFF none repeat scroll 0% 0%;
  z-index:9999;
  visibility:hidden;
  position:absolute;
  padding: 0px;
  border-radius: 3px;
  white-space: nowrap;
}

div.intcaselink {
  cursor: pointer;
  padding: 3px 8px 3px 8px;
  margin: 5px;
  background:#EEE none repeat scroll 0% 0%;
  border:1px solid #AAA;
  border-radius: 3px;
}

div.refpageimage {
  position: absolute;
  left: 0px;
  top: 0px;
  font-size: 0px;
  width: 16px;
  height: 16px;
  cursor: pointer;
  background-repeat: no-repeat;
}

div.annnoteimage {
  position: absolute;
  left: 0px;
  top: 0px;
  font-size: 0px;
  /*width: 16px;
  height: 12px;*/
  cursor: help;
  /*background-image: url(images/note.gif);*/
  /*background-repeat: no-repeat;*/
  width: 13px;
  height: 12px;
  padding-top: 1px;
  text-align: center;
  background-color: #138CDD;
  -moz-box-shadow: 1px 1px 3px #aaa;
  -webkit-box-shadow: 1px 1px 3px #aaa;
  box-shadow: 1px 1px 3px #aaa;
}

div.annnoteline {
  display: inline-block;
  width: 9px;
  height: 1px;
  border-bottom: 1px solid white;
  margin-top: 1px;
}

div.annnotelabel {
  /*position: absolute;
  left: 0px;
  top: 0px;*/
  font-family: Helvetica,Arial;
  white-space: nowrap;

  padding-top: 1px;
  background-color: #fff849;
  font-size: 10px;
  font-weight: bold;
  line-height: 14px;
  margin-right: 3px;
  padding: 0px 4px;
  color: #000;

  -moz-box-shadow: 1px 1px 3px #aaa;
  -webkit-box-shadow: 1px 1px 3px #aaa;
  box-shadow: 1px 1px 3px #aaa;
}

div.annnote {
  display: flex;
  position: absolute;
  cursor: help;
  line-height: 14px;
}

.annotation {
  font-size: 12px;
  padding-left: 2px;
  margin-bottom: 5px;
}

.annotationName {
  /*font-size: 13px;
  font-weight: bold;
  margin-bottom: 3px;
  white-space: nowrap;*/

  font-family: 'Trebuchet MS';
  font-size: 14px;
  font-weight: bold;
  margin-bottom: 5px;
  white-space: nowrap;
}

.annotationValue {
  font-family: Arial, Helvetica, Sans-Serif;
  font-size: 12px;
  color: #4a4a4a;
  line-height: 21px;
  margin-bottom: 20px;
}

.noteLink {
  text-decoration: inherit;
  color: inherit;
}

.noteLink:hover {
  background-color: white;
}

/* this is a fix for the issue where dialogs jump around and takes the text-align from the body */
.dialogFix {
  position:absolute;
  text-align:left;
  border: 1px solid #8f949a;
}


@keyframes pulsate {
  from {
    box-shadow: 0 0 10px #15d6ba;
  }
  to {
    box-shadow: 0 0 20px #15d6ba;
  }
}

@-webkit-keyframes pulsate {
  from {
    -webkit-box-shadow: 0 0 10px #15d6ba;
    box-shadow: 0 0 10px #15d6ba;
  }
  to {
    -webkit-box-shadow: 0 0 20px #15d6ba;
    box-shadow: 0 0 20px #15d6ba;
  }
}

@-moz-keyframes pulsate {
  from {
    -moz-box-shadow: 0 0 10px #15d6ba;
    box-shadow: 0 0 10px #15d6ba;
  }
  to {
    -moz-box-shadow: 0 0 20px #15d6ba;
    box-shadow: 0 0 20px #15d6ba;
  }
}

.legacyPulsateBorder {
  /*border: 5px solid #15d6ba;
  margin: -5px;*/
  -moz-box-shadow: 0 0 10px 3px #15d6ba;
  box-shadow: 0 0 10px 3px #15d6ba;
}

.pulsateBorder {
  animation-name: pulsate;
  animation-timing-function: ease-in-out;
  animation-duration: 0.9s;
  animation-iteration-count: infinite;
  animation-direction: alternate;

  -webkit-animation-name: pulsate;
  -webkit-animation-timing-function: ease-in-out;
  -webkit-animation-duration: 0.9s;
  -webkit-animation-iteration-count: infinite;
  -webkit-animation-direction: alternate;

  -moz-animation-name: pulsate;
  -moz-animation-timing-function: ease-in-out;
  -moz-animation-duration: 0.9s;
  -moz-animation-iteration-count: infinite;
  -moz-animation-direction: alternate;
}

.ax_default_hidden, .ax_default_unplaced{
  display: none;
  visibility: hidden;
}

.widgetNoteSelected {
  -moz-box-shadow: 0 0 10px 3px #138CDD;
  box-shadow: 0 0 10px 3px #138CDD;
  /*-moz-box-shadow: 0 0 20px #3915d6;
  box-shadow: 0 0 20px #3915d6;*/
  /*border: 3px solid #3915d6;*/
  /*margin: -3px;*/
}


.singleImg {
  display: none;
  visibility: hidden;
}

#ios-safari {
  overflow: auto;
  -webkit-overflow-scrolling: touch;
}

#ios-safari-html {
  display: block;
  overflow: auto;
  -webkit-overflow-scrolling: touch;
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}

#ios-safari-fixed {
  position: absolute;
  pointer-events: none;
  width: initial;
}

#ios-safari-fixed div {
  pointer-events: auto;
}
body {
  margin:0px;
  background-color:rgba(13, 51, 101, 1);
  background-image:url('@/assets/bg2.png');
  background-position:right top;
  background-repeat:no-repeat;
  background-attachment:scroll;
  background-size:1343px 725px;
  background-origin:border-box;
  position:static;
  left:auto;
  width:1377px;
  margin-left:0;
  margin-right:0;
  text-align:left;
}
.form_sketch {
  border-color:transparent;
  background-color:transparent;
}
#base {
  position:absolute;
  z-index:0;
}
#u0_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:1377px;
  height:37px;
  background:inherit;
  background-color:rgba(13, 51, 101, 1);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
}
#u0 {
  border-width:0px;
  position:absolute;
  left:0px;
  top:2106px;
  width:1377px;
  height:37px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
}
#u0 .text {
  position:absolute;
  align-self:center;
  padding:2px 2px 2px 2px;
  box-sizing:border-box;
  width:100%;
}
#u0_text {
  border-width:0px;
  word-wrap:break-word;
  text-transform:none;
  visibility:hidden;
}
#u1_img {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:238px;
}
#u1 {
  border-width:0px;
  position:absolute;
  left:25px;
  top:24px;
  width:238px;
  height:45px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
}
#u1 .text {
  position:absolute;
  align-self:center;
  padding:2px 2px 2px 2px;
  box-sizing:border-box;
  width:100%;
}
#u1_text {
  border-width:0px;
  word-wrap:break-word;
  text-transform:none;
  visibility:hidden;
}
#u2_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:553px;
  height:254px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-style:normal;
  font-size:40px;
  color:#FFFFFF;
  line-height:43px;
}
#u2 {
  border-width:0px;
  position:absolute;
  left:48px;
  top:107px;
  width:553px;
  height:254px;
  display:flex;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-style:normal;
  font-size:40px;
  color:#FFFFFF;
  line-height:43px;
}
#u2 .text {
  position:absolute;
  align-self:center;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u2_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u3_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:544px;
  height:22px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-left:0px;
  border-top:0px;
  border-right:0px;
  border-bottom:0px;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Light', 'Noto Sans Kannada Light', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:16px;
  color:#FFFFFF;
}
#u3 {
  border-width:0px;
  position:absolute;
  left:48px;
  top:1329px;
  width:544px;
  height:22px;
  display:flex;
  font-family:'NotoSansKannada-Light', 'Noto Sans Kannada Light', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:16px;
  color:#FFFFFF;
}
#u3 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u3_text {
  border-width:0px;
  word-wrap:break-word;
  text-transform:none;
}
#u4_input {
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  padding:3px 2px 3px 0px;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  letter-spacing:normal;
  color:#555555;
  vertical-align:none;
  text-align:left;
  text-transform:none;
  background-color:transparent;
  border-color:transparent;
}
#u4_input.disabled {
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  padding:3px 2px 3px 0px;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  letter-spacing:normal;
  color:#555555;
  vertical-align:none;
  text-align:left;
  text-transform:none;
  background-color:transparent;
  border-color:transparent;
}
#u4_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  background:inherit;
  background-color:rgba(255, 255, 255, 1);
  border:none;
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#555555;
}
#u4 {
  border-width:0px;
  position:absolute;
  left:48px;
  top:1358px;
  width:751px;
  height:48px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#555555;
}
#u4 .text {
  position:absolute;
  align-self:center;
  padding:2px 2px 2px 0px;
  box-sizing:border-box;
  width:100%;
}
#u4_div.disabled {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  background:inherit;
  background-color:rgba(240, 240, 240, 1);
  border:none;
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#555555;
}
#u4.disabled {
}
#u5_input {
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:170px;
  padding:3px 2px 3px 1px;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  letter-spacing:normal;
  color:#AAAAAA;
  vertical-align:none;
  text-align:left;
  text-transform:none;
  background-color:transparent;
  border-color:transparent;
  resize:none;
}
#u5_input.disabled {
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:170px;
  padding:3px 2px 3px 1px;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  letter-spacing:normal;
  color:#AAAAAA;
  vertical-align:none;
  text-align:left;
  text-transform:none;
  background-color:transparent;
  border-color:transparent;
  resize:none;
}
#u5_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:170px;
  background:inherit;
  background-color:rgba(255, 255, 255, 1);
  border:none;
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#AAAAAA;
}
#u5 {
  border-width:0px;
  position:absolute;
  left:48px;
  top:1494px;
  width:751px;
  height:170px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#AAAAAA;
}
#u5 .text {
  position:absolute;
  align-self:flex-start;
  padding:2px 2px 2px 1px;
  box-sizing:border-box;
  width:100%;
}
#u5_div.disabled {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:170px;
  background:inherit;
  background-color:rgba(240, 240, 240, 1);
  border:none;
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#AAAAAA;
}
#u5.disabled {
}
#u6 label {
  left:0px;
  width:100%;
}
#u6_img {
  border-width:0px;
  position:absolute;
  left:0px;
  top:5px;
  width:12px;
  height:12px;
}
#u6 {
  border-width:0px;
  position:absolute;
  left:48px;
  top:1677px;
  width:259px;
  height:22px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:16px;
  color:#FFFFFF;
}
#u6 .text {
  position:absolute;
  align-self:center;
  padding:0px 2px 0px 2px;
  box-sizing:border-box;
}
#u6_img.selected {
}
#u6.selected {
}
#u6_img.disabled {
}
#u6.disabled {
}
#u6_text {
  border-width:0px;
  position:absolute;
  left:14px;
  top:0px;
  width:243px;
  word-wrap:break-word;
  text-transform:none;
}
#u6_input {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:0px;
  height:0px;
  opacity:0;
}
#u7_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:414px;
  height:22px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Light', 'Noto Sans Kannada Light', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:16px;
  color:#FFFFFF;
}
#u7 {
  border-width:0px;
  position:absolute;
  left:67px;
  top:1699px;
  width:414px;
  height:22px;
  display:flex;
  font-family:'NotoSansKannada-Light', 'Noto Sans Kannada Light', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:16px;
  color:#FFFFFF;
}
#u7 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u7_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u8_input {
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  padding:3px 2px 3px 0px;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  letter-spacing:normal;
  color:#555555;
  vertical-align:none;
  text-align:left;
  text-transform:none;
  background-color:transparent;
  border-color:transparent;
}
#u8_input.disabled {
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  padding:3px 2px 3px 0px;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  letter-spacing:normal;
  color:#555555;
  vertical-align:none;
  text-align:left;
  text-transform:none;
  background-color:transparent;
  border-color:transparent;
}
#u8_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  background:inherit;
  background-color:rgba(255, 255, 255, 1);
  border:none;
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#555555;
}
#u8 {
  border-width:0px;
  position:absolute;
  left:48px;
  top:1426px;
  width:751px;
  height:48px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#555555;
}
#u8 .text {
  position:absolute;
  align-self:flex-start;
  padding:2px 2px 2px 0px;
  box-sizing:border-box;
  width:100%;
}
#u8_div.disabled {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:751px;
  height:48px;
  background:inherit;
  background-color:rgba(240, 240, 240, 1);
  border:none;
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  font-size:14px;
  color:#555555;
}
#u8.disabled {
}
.u8_input_option {
  font-weight:400;
  font-style:normal;
  font-size:14px;
}
#u9_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:226px;
  height:411px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  color:#FFFFFF;
}
#u9 {
  border-width:0px;
  position:absolute;
  left:524px;
  top:645px;
  width:226px;
  height:411px;
  display:flex;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  color:#FFFFFF;
}
#u9 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u9_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u10_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:117px;
  height:27px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u10 {
  border-width:0px;
  position:absolute;
  left:524px;
  top:611px;
  width:117px;
  height:27px;
  display:flex;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u10 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u10_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u11_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:223px;
  height:288px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-style:normal;
  color:#FFFFFF;
}
#u11 {
  border-width:0px;
  position:absolute;
  left:47px;
  top:645px;
  width:223px;
  height:288px;
  display:flex;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-style:normal;
  color:#FFFFFF;
}
#u11 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u11_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u12_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:275px;
  height:27px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u12 {
  border-width:0px;
  position:absolute;
  left:47px;
  top:611px;
  width:275px;
  height:27px;
  display:flex;
  font-family:'NotoSansKannada-Thin', 'Noto Sans Kannada Thin', 'Noto Sans Kannada', sans-serif;
  font-weight:200;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u12 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u12_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u13_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:80px;
  height:27px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;
  font-weight:700;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u13 {
  border-width:0px;
  position:absolute;
  left:47px;
  top:570px;
  width:80px;
  height:27px;
  display:flex;
  font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;
  font-weight:700;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u13 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u13_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u14_img {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:663px;
  height:2px;
}
#u14 {
  border-width:0px;
  position:absolute;
  left:137px;
  top:582px;
  width:662px;
  height:1px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
}
#u14 .text {
  position:absolute;
  align-self:center;
  padding:2px 2px 2px 2px;
  box-sizing:border-box;
  width:100%;
}
#u14_text {
  border-width:0px;
  word-wrap:break-word;
  text-transform:none;
  visibility:hidden;
}
#u15_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:80px;
  height:27px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  border:none;
  border-radius:0px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;
  font-weight:700;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u15 {
  border-width:0px;
  position:absolute;
  left:47px;
  top:1282px;
  width:80px;
  height:27px;
  display:flex;
  font-family:'NotoSansKannada-Bold', 'Noto Sans Kannada Bold', 'Noto Sans Kannada', sans-serif;
  font-weight:700;
  font-style:normal;
  font-size:20px;
  color:#FFFFFF;
}
#u15 .text {
  position:absolute;
  align-self:flex-start;
  padding:0px 0px 0px 0px;
  box-sizing:border-box;
  width:100%;
}
#u15_text {
  border-width:0px;
  white-space:nowrap;
  text-transform:none;
}
#u16_img {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:663px;
  height:2px;
}
#u16 {
  border-width:0px;
  position:absolute;
  left:137px;
  top:1294px;
  width:662px;
  height:1px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
}
#u16 .text {
  position:absolute;
  align-self:center;
  padding:2px 2px 2px 2px;
  box-sizing:border-box;
  width:100%;
}
#u16_text {
  border-width:0px;
  word-wrap:break-word;
  text-transform:none;
  visibility:hidden;
}
#u17_div {
  border-width:0px;
  position:absolute;
  left:0px;
  top:0px;
  width:271px;
  height:49px;
  background:inherit;
  background-color:rgba(255, 255, 255, 0);
  box-sizing:border-box;
  border-width:1px;
  border-style:solid;
  border-color:rgba(255, 255, 255, 1);
  border-radius:5px;
  -moz-box-shadow:none;
  -webkit-box-shadow:none;
  box-shadow:none;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  color:#FFFFFF;
}
#u17 {
  border-width:0px;
  position:absolute;
  left:288px;
  top:1745px;
  width:271px;
  height:49px;
  display:flex;
  font-family:'NotoSansKannada-Regular', 'Noto Sans Kannada', sans-serif;
  font-weight:400;
  font-style:normal;
  color:#FFFFFF;
}
#u17 .text {
  position:absolute;
  align-self:center;
  padding:2px 2px 2px 2px;
  box-sizing:border-box;
  width:100%;
}
#u17_text {
  border-width:0px;
  word-wrap:break-word;
  text-transform:none;
}
</style>