window.hjSiteSettings = window.hjSiteSettings || {"site_id":954792,"rec_value":1.0,"state_change_listen_mode":"automatic","record":true,"continuous_capture_enabled":true,"recording_capture_keystrokes":false,"session_capture_console_consent":true,"anonymize_digits":true,"anonymize_emails":true,"suppress_all":false,"suppress_all_on_specific_pages":[],"suppress_text":null,"suppress_location":false,"user_attributes_enabled":true,"legal_name":"","privacy_policy_url":"","deferred_page_contents":[],"record_targeting_rules":[{"component":"url","match_operation":"starts_with","pattern":"https://www.mongodb.com/use-cases/artificial-intelligence","negate":false},{"component":"url","match_operation":"starts_with","pattern":"https://www.mongodb.com/products/platform/atlas-stream-processing","negate":false},{"component":"url","match_operation":"starts_with","pattern":"https://www.mongodb.com/cloud/atlas/register","negate":false},{"component":"url","match_operation":"simple","pattern":"https://www.mongodb.com/atlas","negate":false},{"component":"url","match_operation":"contains","pattern":"https://www.mongodb.com/pricing","negate":false},{"component":"url","match_operation":"contains","pattern":"https://www.mongodb.com/solutions/solutions-library","negate":false},{"component":"url","match_operation":"contains","pattern":"https://www.mongodb.com/events/mongodb-local/nyc","negate":false}],"feedback_widgets":[],"heatmaps":[],"polls":[],"integrations":{"optimizely":{"tag_recordings":false},"abtasty":{"tag_recordings":false},"kissmetrics":{"send_user_id":false},"mixpanel":{"send_events":false},"unbounce":{"tag_recordings":false},"hubspot":{"enabled":false,"send_recordings":false,"send_surveys":false}},"features":["ask.popover_redesign","client_script.compression.pc","error_reporting","feedback.embeddable_widget","feedback.widgetV2","feedback.widget_telemetry","settings.billing_v2","survey.embeddable_widget","survey.image_question","survey.screenshots","survey.type_button"],"tracking_code_verified":true,"cs_project_id":null};

!function(){"use strict";function e(t){return e="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e},e(t)}function t(e,t){for(var r=0;r<t.length;r++){var i=t[r];i.enumerable=i.enumerable||!1,i.configurable=!0,"value"in i&&(i.writable=!0),Object.defineProperty(e,n(i.key),i)}}function n(t){var n=function(t,n){if("object"!=e(t)||!t)return t;var r=t[Symbol.toPrimitive];if(void 0!==r){var i=r.call(t,"string");if("object"!=e(i))return i;throw new TypeError("@@toPrimitive must return a primitive value.")}return String(t)}(t);return"symbol"==e(n)?n:String(n)}var r,i=function(){function e(t){var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:10,r=arguments.length>2&&void 0!==arguments[2]?arguments[2]:1e3;!function(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}(this,e),this.send=t,this.batchSize=n,this.flushInterval=r,this.buffer=[],this.flushTimer=null}var n,r;return n=e,(r=[{key:"getBuffer",value:function(){return this.buffer}},{key:"add",value:function(e){var t=this;this.buffer.push(e),this.buffer.length>=this.batchSize?this.flush():this.flushTimer||(this.flushTimer=setTimeout((function(){t.flush()}),this.flushInterval))}},{key:"flush",value:function(){this.buffer.length>0&&(this.send(this.buffer),this.buffer=[]),this.flushTimer&&(clearTimeout(this.flushTimer),this.flushTimer=null)}}])&&t(n.prototype,r),Object.defineProperty(n,"prototype",{writable:!1}),e}();function a(){return a=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var r in n)Object.prototype.hasOwnProperty.call(n,r)&&(e[r]=n[r])}return e},a.apply(this,arguments)}var o,s=function(){try{return"performance"in window&&"now"in window.performance}catch(e){return!1}},c={version:6,metricsUrl:(null===(r=window._hjSettings)||void 0===r?void 0:r.metricsUrl)||"https://metrics.hotjar.io",sampling:{metrics:.1,fieldMetrics:.01,debug:.5,universalDebug:.05*.1},browser:{hasPerformance:!1,shouldLogMetrics:!1,inLab:!1},buffer:{bufferSize:40,flushInterval:3e3}},l={isDebugEnabled:!1,isMetricsEnabled:!1,isFieldMetricsEnabled:!1,loggedMetrics:{},genericTags:{}},u=function(e,t,n){var r;l.loggedMetrics[e]=a(a({},l.loggedMetrics[e]),{},((r={})[t]=n||{},r))},d=function(e){if(!e)return"value";var t=Object.keys(e)[0];return t&&e[t]||"value"},g=function(e){var t,n=null!==(t=e.tag)&&void 0!==t?t:void 0;return l.isDebugEnabled?a(a(a({},n),e.extraTags),l.genericTags):n},f=function(e,t){if(!o)return!1;var n=l.isMetricsEnabled||l.isDebugEnabled;return"lab"===e&&(n=c.browser.inLab),"field"===e&&(n=l.isFieldMetricsEnabled),t?n&&t.flush:n},h=function(e){var t=!1,n="v=".concat(c.version),r="".concat(c.metricsUrl,"?").concat(n,"&site_id=").concat(window.hjSiteSettings.site_id)+(l.isDebugEnabled?"&debug=true":""),i=JSON.stringify(e);if("sendBeacon"in navigator)try{t=navigator.sendBeacon.bind(navigator)(r,i)}catch(e){}if(!1===t)try{var a=new XMLHttpRequest;a.open("POST",r),a.timeout=1e4,a.send(i)}catch(e){}c.browser.shouldLogMetrics&&console.debug("New Metrics: ",e)},p={getConfig:function(e){return c[e]},getState:function(e){return l[e]},start:function(){try{c.browser={hasPerformance:s(),shouldLogMetrics:/hjMetrics=1/.test(location.search),inLab:/hjLab=true/.test(location.search)};var e=p.time(),t=window.hjSiteSettings||{},n=t.features,r=t.site_id,a=new Set(n),u=c.sampling;return l.genericTags={site_id:r},l.isDebugEnabled=Math.random()<=u.universalDebug||a.has("client_script.metrics.debug")&&Math.random()<=u.debug,l.isMetricsEnabled=Math.random()<=u.metrics,l.isFieldMetricsEnabled=l.isMetricsEnabled&&Math.random()<=u.fieldMetrics,o=new i(h,c.buffer.bufferSize,c.buffer.flushInterval),e}catch(e){console.debug("Error in metrics.start",{error:e})}},reset:function(){l.loggedMetrics={}},stop:function(){l.isDebugEnabled=!1,l.isMetricsEnabled=!1,l.genericTags={}},count:function(e,t){var n=t.incr,r=t.tag,i=t.extraTags,s=t.type;try{var c,u=d(r),h=l.loggedMetrics[e],p=0;if(n?(p=(h&&h[u]||0)+(n.value||1),l.loggedMetrics[e]=a(a({},h),{},((c={})[u]=null!=n&&n.flush?0:p,c))):p=1,f(s,n)){var m={name:e,type:"count",value:p,tags:g({tag:r,extraTags:i})};o.add(m)}}catch(e){}},distr:function(e,t){var n=t.task,r=t.value,i=t.extraTags;f()&&o.add({name:e,type:"distribution",value:r,tags:g({tag:{task:n},extraTags:i})})},time:function(){try{if(!c.browser.hasPerformance)return;return performance.now()}catch(e){}},timeEnd:function(e,t){var n=t.tag,r=t.start,i=t.total,a=t.extraTags,s=t.type;try{var c=p.time();if(!i&&!c)return;var l=d(n),h=i||(r&&c?c-r:void 0);if(u(e,l,{}),h&&h>0&&f(s)){var m={name:e,type:"distribution",value:Math.round(h),tags:g({tag:n,extraTags:a})};o.add(m)}return c}catch(t){console.debug("Failed to send timer metric: ",{name:e,tag:n,error:t})}},timeIncr:function(e,t){var n,r,i,a,o=t.tag,s=t.start,c=t.flush,g=t.extraTags,f=t.type,h=hj.metrics.time(),m=s&&h?h-s:void 0,v=(n=e,{tagName:r=d(o),start:(a=(i=l.loggedMetrics[n])&&i[r]||{}).start,total:a.total}),b=m?m+(v.total||0):v.total;return u(e,v.tagName,{total:b}),c&&p.timeEnd(e,{tag:o,total:b,extraTags:g,type:f}),b},timeWatcher:function(){var e,t=0,n=!1,r=function(){var n,r=p.time();return t+=null!==(n=e&&r&&r-e)&&void 0!==n?n:0,e=p.time(),t};return{start:function(){if(!n)return n=!0,e=p.time()},incr:r,end:function(){var n=r();return t=0,e=void 0,n}}},getErrorMessage:function(e){return e instanceof Error?e.message:"string"==typeof e?e:""}};function m(e){return function(e){if(Array.isArray(e))return v(e)}(e)||function(e){if("undefined"!=typeof Symbol&&null!=e[Symbol.iterator]||null!=e["@@iterator"])return Array.from(e)}(e)||function(e,t){if(e){if("string"==typeof e)return v(e,t);var n=Object.prototype.toString.call(e).slice(8,-1);return"Object"===n&&e.constructor&&(n=e.constructor.name),"Map"===n||"Set"===n?Array.from(e):"Arguments"===n||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n)?v(e,t):void 0}}(e)||function(){throw new TypeError("Invalid attempt to spread non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method.")}()}function v(e,t){(null==t||t>e.length)&&(t=e.length);for(var n=0,r=new Array(t);n<t;n++)r[n]=e[n];return r}var b=function(e){return e.replayRecordingMaskedUrlRegex="replayRecordingMaskedUrlRegex",e.replayRecordingMaskedUrlRegexRules="replayRecordingMaskedUrlRegexRules",e}(b||{}),w=function(e){return e.START="start",e.NOT_START="not-start",e.END="end",e.NOT_END="not-end",e.CONTAIN="contain",e.NOT_CONTAIN="not-contain",e.EXACT="exact",e.NOT_EXACT="not-exact",e}(w||{});var y,_;window.hj=window.hj||function(){for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];(window.hj.q=window.hj.q||[]).push(t)},window.hj.metrics=p;var j,S,T,E,R,M,C,O,A,x,I,N,k,U,P,B,D=hj.metrics.start(),F=!(!window.CS_CONF||null===(y=window.CS_CONF.voc)||void 0===y||!y.enabled),L=!(window.CS_CONF||!(null!==(_=window.hjSiteSettings.features)&&void 0!==_&&_.includes("cs_lite")||window._hjSettings.csid));if(window.hjLazyModules=window.hjLazyModules||{SURVEY_V2:{js:"survey-v2.d3ee5134219dccecb76c.js"},SURVEY_BOOTSTRAPPER:{js:"survey-bootstrapper.5280a8379cf419902f72.js"},SURVEY_ISOLATED:{js:"survey-isolated.4552302bd7eac650926f.js"},HEATMAP_RETAKER:{js:"heatmap-retaker.f79c0c7bb13d8a14bddc.js"},SURVEY_INVITATION:{js:"survey-invitation.9a91b66dc1e33840228c.js"},NOTIFICATION:{js:"notification.86732657079a99e6ce8a.js"},PREACT_INCOMING_FEEDBACK:{js:"preact-incoming-feedback.603d80d591deeda20379.js"},SENTRY:{js:"sentry.58c81e3e25532810f6fd.js"},BROWSER_PERF:{js:"browser-perf.8417c6bba72228fa2e29.js"},USER_TEST:{js:"user-test.003588e64baa312df7ae.js"}},F)window._uxa.push(["start:hotjar",window.hjSiteSettings]);else if(L){var z=(C=(j=window.hjSiteSettings).suppress_all||j.suppress_text||(null===(S=j.suppress_all_on_specific_pages)||void 0===S?void 0:S.length),O=function(e){var t,n,r,i,a,o={anonymisationMethod:null,replayRecordingMaskedUrlRegex:null,replayRecordingMaskedUrlRegexRules:null};if((e.suppress_all||e.suppress_text)&&(o.anonymisationMethod=b.replayRecordingMaskedUrlRegex,o.replayRecordingMaskedUrlRegex=".*"),null!==(t=e.suppress_all_on_specific_pages)&&void 0!==t&&t.length){o.anonymisationMethod=b.replayRecordingMaskedUrlRegexRules;var s=(n=e.suppress_all_on_specific_pages,r={contains:w.CONTAIN,regex:w.CONTAIN,simple:w.CONTAIN,ends_with:w.END,exact:w.EXACT,starts_with:w.START},i=[],a=Object.keys(r),n.forEach((function(e){if(e.pattern&&a.includes(e.match_operation)){var t={operator:r[e.match_operation],value:e.pattern,ignoreQueryParams:"simple"===e.match_operation,ignoreURIFragments:"simple"===e.match_operation,ignoreCaseSensitivity:"simple"===e.match_operation,notOperator:e.negate};i.push(t)}})),i.length?i:void 0);o.replayRecordingMaskedUrlRegexRules=s||null}return o}(j),A=O.anonymisationMethod,x=O.replayRecordingMaskedUrlRegex,I=O.replayRecordingMaskedUrlRegexRules,{CS_CONF_BASE:{projectId:j.cs_project_id,smbConfig:{siteId:j.site_id,useCSTC:!0,csLiteDomain:null!==(T=_hjSettings)&&void 0!==T&&T.environment&&"live"!==_hjSettings.environment?"insights-integration.live.eks.hotjar.com":"insights.hotjar.com"},hostnames:[window.location.hostname],voc:null!==(E=j.feedback_widgets)&&void 0!==E&&E.length||null!==(R=j.polls)&&void 0!==R&&R.length?{enabled:1,siteId:j.site_id}:{enabled:0},whitelistedAttributes:[],anonymizeDigits:!!C||j.anonymize_digits,implementations:(N=j,k=m,U="manual"===(B=N.state_change_listen_mode)?[]:[{template:{name:"ArtificialPageview",args:{}},triggers:[{name:"HistoryChange",args:{listeners:"popstate, pushState, replaceState"+("automatic_with_fragments"===B?", hashchange":""),useDebounce:"no",window:400}}]}],U&&!Array.isArray(U)&&"number"==typeof U.length?v(U,U.length):k(U,P)),anonymisationMethod:A,replayRecordingMaskedUrlRegex:x,replayRecordingMaskedUrlRegexRules:I},PII_SELECTORS:j.suppress_all||(null===(M=j.suppress_all_on_specific_pages)||void 0===M?void 0:M.length)?["img, video, source"]:null}),H=z.CS_CONF_BASE,V=z.PII_SELECTORS;window.CS_CONF_BASE=H,window._uxa=window._uxa||[],V&&window._uxa.push(["setPIISelectors",{PIISelectors:V}]);var q=window._hjSettings.environment,Y="t.contentsquare.net";q&&"live"!==q&&(window._hjSettings.csid&&(window.CS_CONF_BASE.projectId=window._hjSettings.csid),Y="t-staging.contentsquare.net");var X=document.createElement("script");X.type="text/javascript",X.async=!0,X.src="//".concat(Y,"/uxa/smb/tag.js"),document.getElementsByTagName("head")[0].appendChild(X)}else window.hjBootstrap=window.hjBootstrap||function(e,t,n){var r,i=new RegExp("bot|google|headless|baidu|bing|msn|duckduckbot|teoma|slurp|yandex|phantomjs|pingdom|ahrefsbot|facebook","i"),a=(null===(r=window.navigator)||void 0===r?void 0:r.userAgent)||"unknown";if(i.test(a))return hj.metrics.count("session-rejection",{tag:{reason:"bot"}}),void console.warn("Hotjar not launching due to suspicious userAgent:",a);var o="http:"===window.location.protocol,s=Boolean(window._hjSettings.preview);if(o&&!s)return hj.metrics.count("session-rejection",{tag:{reason:"https"}}),void console.warn("For security reasons, Hotjar only works over HTTPS. Learn more: https://help.hotjar.com/hc/en-us/articles/115011624047");var c=function(e,t,n){window.hjBootstrapCalled=(window.hjBootstrapCalled||[]).concat(n),window.hj&&window.hj._init&&window.hj._init._verifyInstallation&&hj._init._verifyInstallation()};c(0,0,n);var l=window.document,u=l.head||l.getElementsByTagName("head")[0];hj.scriptDomain=e;var d=l.createElement("script");d.async=1,d.src=hj.scriptDomain+t,d.charset="utf-8",u.appendChild(d),c.revision="7566312",window.hjBootstrap=c},window.hjBootstrap("https://script.hotjar.com/","modules.720d0264984b164946ff.js","954792"),hj.metrics.timeEnd("resource-blocking-time",{tag:{resource:"hotjar-js"},start:D,type:"lab"})}();