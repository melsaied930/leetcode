(self.webpackChunk_N_E=self.webpackChunk_N_E||[]).push([[6381],{8249:function(e,n,i){"use strict";i.d(n,{n:function(){return Z},Z:function(){return C}});var a=i(26042),r=i(69396),s=i(39977),t=i(67294),o=i(26401),l=i(94320),u=i(51965),c=i(97386),d=i.n(c),m={display:"flex",justifyContent:"space-between",alignItems:"end"},h={display:["flex",null,"none"],justifyContent:"center",alignItems:"center"},p=function(e){return{marginTop:["inc30",null,null,"inc40"],paddingBottom:["inc30",null,"0"],gap:["column"===e?"inc30":"inc40",null,null,"inc40"],overflow:["auto",null,"visible"],mx:["-".concat(d().space.inc40),null,"unset"],px:["inc40",null,"unset"]}},f=function(e){return(0,a.Z)({width:["75vw",null,"row"===e?"auto":"100%"]},"row"===e?{height:"100%"}:{gridColumn:[null,null,"span 3"],height:["100%",null,"default"]})},$=(0,r.Z)((0,a.Z)({},p("row")),{gridTemplateColumns:["repeat(3, 1fr)",null,"repeat(6, 1fr)"]});(0,r.Z)((0,a.Z)({},p("row")),{width:"100%",marginBottom:"inc50"});var g=(0,r.Z)((0,a.Z)({},f("row")),{gridColumn:["span 1",null,"span 6","span 4"],gridRow:[null,null,null,"span 2"]}),v=(0,r.Z)((0,a.Z)({},f("row")),{gridColumn:["span 1",null,"span 3","span 2"]}),w=i(91703),y=function(e){return"news & announcements"===e.toLowerCase()},x=function(e){var n=e.content,i=e.title,c=e.direction,d=void 0===c?"row":c,$=e.href,g=e.extraStyles,v=(0,t.useMemo)(function(){return(0,s.tZ)(l.rj,{columns:3,sx:p(d),children:n.slice(0,3).map(function(e){var n=(0,u.u)(e,"medium");return(0,s.tZ)(u.Z,(0,r.Z)((0,a.Z)({},n),{sx:f(d)}),e.slug)})})},[n]);return(0,s.BX)("div",{"data-testid":"".concat(i.toLowerCase().replace(" ","-"),"-card-section"),sx:(0,a.Z)({gridColumn:["span 6",null,"span 8","span 12","4 / span 9"]},void 0===g?{}:g),children:[(0,s.BX)("div",{sx:m,children:[(0,s.tZ)(o.hz,{variant:"heading5",children:i}),!y(i)&&(0,s.BX)(o.rU,{href:(0,w.m)($||"#"),linkIcon:"arrow",sx:{display:["none",null,"inline"]},children:["All ",i]})]}),v,!y(i)&&(0,s.tZ)("div",{sx:h,children:(0,s.BX)(o.rU,{href:(0,w.m)($||"#"),linkIcon:"arrow",sx:{display:["inline",null,"none"]},children:["All ",i]})})]})},b=i(42140),Z=function(e){var n=e.content,i=e.className,t=e.title,c=e.featuredCardType,d=void 0===c?"large":c;if(n.length<3)return null;var h="middle"===d?(0,u.u)(n[0],"medium"):(0,u.u)(n[0],"large");return(0,s.BX)("div",{"data-testid":"featured-card-section",sx:{gridColumn:["span 6",null,"span 8","span 12","4 / span 9"]},className:i,children:[(0,s.tZ)("div",{sx:m,children:(0,s.tZ)(o.hz,{variant:"heading2",sx:b.m2,children:void 0===t?"Featured":t})}),(0,s.BX)(l.rj,{columns:6,sx:$,children:[(0,s.tZ)(u.Z,(0,a.Z)({sx:"middle"===d?v:g},h),n[0].slug),(0,s.tZ)(u.Z,(0,a.Z)({sx:v},(0,u.u)(n[1],"middle"===d?"medium":"small")),n[1].slug),(0,s.tZ)(u.Z,(0,a.Z)({sx:(0,r.Z)((0,a.Z)({},v),{display:["middle"===d?"none":"flex",null,null,"flex",]})},(0,u.u)(n[2],"middle"===d?"medium":"small")),n[2].slug)]})]})},C=x},60723:function(e,n,i){"use strict";i.d(n,{A:function(){return d}});var a=i(26042),r=i(69396),s=i(39977),t=i(67294),o=i(94320),l=i(26401),u=i(9059),c=i(74380),d=function(e){var n=e.topics,i=e.title,d=e.className;return(0,s.BX)("div",{sx:c.MG,className:d,children:[(0,s.tZ)(l.hz,{variant:"heading5",children:i}),(0,s.tZ)(o.rj,{columns:4,sx:c.IW,children:n.map(function(e){return(0,t.createElement)(u.uX,(0,r.Z)((0,a.Z)({},e),{key:e.title}))})})]})}},23450:function(e){var n;n=function(){var e=[],n=[],i={},a={},r={};function s(e){return"string"==typeof e?RegExp("^"+e+"$","i"):e}function t(e,n){return e===n?n:e===e.toLowerCase()?n.toLowerCase():e===e.toUpperCase()?n.toUpperCase():e[0]===e[0].toUpperCase()?n.charAt(0).toUpperCase()+n.substr(1).toLowerCase():n.toLowerCase()}function o(e,n){return e.replace(n[0],function(i,a){var r,s,o=(r=n[1],s=arguments,r.replace(/\$(\d{1,2})/g,function(e,n){return s[n]||""}));return""===i?t(e[a-1],o):t(i,o)})}function l(e,n,a){if(!e.length||i.hasOwnProperty(e))return n;for(var r=a.length;r--;){var s=a[r];if(s[0].test(n))return o(n,s)}return n}function u(e,n,i){return function(a){var r=a.toLowerCase();return n.hasOwnProperty(r)?t(a,r):e.hasOwnProperty(r)?t(a,e[r]):l(r,a,i)}}function c(e,n,i,a){return function(a){var r=a.toLowerCase();return!!n.hasOwnProperty(r)||!e.hasOwnProperty(r)&&l(r,r,i)===r}}function d(e,n,i){var a=1===n?d.singular(e):d.plural(e);return(i?n+" ":"")+a}return d.plural=u(r,a,e),d.isPlural=c(r,a,e),d.singular=u(a,r,n),d.isSingular=c(a,r,n),d.addPluralRule=function(n,i){e.push([s(n),i])},d.addSingularRule=function(e,i){n.push([s(e),i])},d.addUncountableRule=function(e){if("string"==typeof e){i[e.toLowerCase()]=!0;return}d.addPluralRule(e,"$0"),d.addSingularRule(e,"$0")},d.addIrregularRule=function(e,n){n=n.toLowerCase(),r[e=e.toLowerCase()]=n,a[n]=e},[["I","we"],["me","us"],["he","they"],["she","they"],["them","them"],["myself","ourselves"],["yourself","yourselves"],["itself","themselves"],["herself","themselves"],["himself","themselves"],["themself","themselves"],["is","are"],["was","were"],["has","have"],["this","these"],["that","those"],["echo","echoes"],["dingo","dingoes"],["volcano","volcanoes"],["tornado","tornadoes"],["torpedo","torpedoes"],["genus","genera"],["viscus","viscera"],["stigma","stigmata"],["stoma","stomata"],["dogma","dogmata"],["lemma","lemmata"],["schema","schemata"],["anathema","anathemata"],["ox","oxen"],["axe","axes"],["die","dice"],["yes","yeses"],["foot","feet"],["eave","eaves"],["goose","geese"],["tooth","teeth"],["quiz","quizzes"],["human","humans"],["proof","proofs"],["carve","carves"],["valve","valves"],["looey","looies"],["thief","thieves"],["groove","grooves"],["pickaxe","pickaxes"],["passerby","passersby"]].forEach(function(e){return d.addIrregularRule(e[0],e[1])}),[[/s?$/i,"s"],[/[^\u0000-\u007F]$/i,"$0"],[/([^aeiou]ese)$/i,"$1"],[/(ax|test)is$/i,"$1es"],[/(alias|[^aou]us|t[lm]as|gas|ris)$/i,"$1es"],[/(e[mn]u)s?$/i,"$1s"],[/([^l]ias|[aeiou]las|[ejzr]as|[iu]am)$/i,"$1"],[/(alumn|syllab|vir|radi|nucle|fung|cact|stimul|termin|bacill|foc|uter|loc|strat)(?:us|i)$/i,"$1i"],[/(alumn|alg|vertebr)(?:a|ae)$/i,"$1ae"],[/(seraph|cherub)(?:im)?$/i,"$1im"],[/(her|at|gr)o$/i,"$1oes"],[/(agend|addend|millenni|dat|extrem|bacteri|desiderat|strat|candelabr|errat|ov|symposi|curricul|automat|quor)(?:a|um)$/i,"$1a"],[/(apheli|hyperbat|periheli|asyndet|noumen|phenomen|criteri|organ|prolegomen|hedr|automat)(?:a|on)$/i,"$1a"],[/sis$/i,"ses"],[/(?:(kni|wi|li)fe|(ar|l|ea|eo|oa|hoo)f)$/i,"$1$2ves"],[/([^aeiouy]|qu)y$/i,"$1ies"],[/([^ch][ieo][ln])ey$/i,"$1ies"],[/(x|ch|ss|sh|zz)$/i,"$1es"],[/(matr|cod|mur|sil|vert|ind|append)(?:ix|ex)$/i,"$1ices"],[/\b((?:tit)?m|l)(?:ice|ouse)$/i,"$1ice"],[/(pe)(?:rson|ople)$/i,"$1ople"],[/(child)(?:ren)?$/i,"$1ren"],[/eaux$/i,"$0"],[/m[ae]n$/i,"men"],["thou","you"]].forEach(function(e){return d.addPluralRule(e[0],e[1])}),[[/s$/i,""],[/(ss)$/i,"$1"],[/(wi|kni|(?:after|half|high|low|mid|non|night|[^\w]|^)li)ves$/i,"$1fe"],[/(ar|(?:wo|[ae])l|[eo][ao])ves$/i,"$1f"],[/ies$/i,"y"],[/\b([pl]|zomb|(?:neck|cross)?t|coll|faer|food|gen|goon|group|lass|talk|goal|cut)ies$/i,"$1ie"],[/\b(mon|smil)ies$/i,"$1ey"],[/\b((?:tit)?m|l)ice$/i,"$1ouse"],[/(seraph|cherub)im$/i,"$1"],[/(x|ch|ss|sh|zz|tto|go|cho|alias|[^aou]us|t[lm]as|gas|(?:her|at|gr)o|[aeiou]ris)(?:es)?$/i,"$1"],[/(analy|diagno|parenthe|progno|synop|the|empha|cri|ne)(?:sis|ses)$/i,"$1sis"],[/(movie|twelve|abuse|e[mn]u)s$/i,"$1"],[/(test)(?:is|es)$/i,"$1is"],[/(alumn|syllab|vir|radi|nucle|fung|cact|stimul|termin|bacill|foc|uter|loc|strat)(?:us|i)$/i,"$1us"],[/(agend|addend|millenni|dat|extrem|bacteri|desiderat|strat|candelabr|errat|ov|symposi|curricul|quor)a$/i,"$1um"],[/(apheli|hyperbat|periheli|asyndet|noumen|phenomen|criteri|organ|prolegomen|hedr|automat)a$/i,"$1on"],[/(alumn|alg|vertebr)ae$/i,"$1a"],[/(cod|mur|sil|vert|ind)ices$/i,"$1ex"],[/(matr|append)ices$/i,"$1ix"],[/(pe)(rson|ople)$/i,"$1rson"],[/(child)ren$/i,"$1"],[/(eau)x?$/i,"$1"],[/men$/i,"man"]].forEach(function(e){return d.addSingularRule(e[0],e[1])}),["adulthood","advice","agenda","aid","aircraft","alcohol","ammo","analytics","anime","athletics","audio","bison","blood","bream","buffalo","butter","carp","cash","chassis","chess","clothing","cod","commerce","cooperation","corps","debris","diabetes","digestion","elk","energy","equipment","excretion","expertise","firmware","flounder","fun","gallows","garbage","graffiti","hardware","headquarters","health","herpes","highjinks","homework","housework","information","jeans","justice","kudos","labour","literature","machinery","mackerel","mail","media","mews","moose","music","mud","manga","news","only","personnel","pike","plankton","pliers","police","pollution","premises","rain","research","rice","salmon","scissors","series","sewage","shambles","shrimp","software","species","staff","swine","tennis","traffic","transportation","trout","tuna","wealth","welfare","whiting","wildebeest","wildlife","you",/pok[eé]mon$/i,/[^aeiou]ese$/i,/deer$/i,/fish$/i,/measles$/i,/o[iu]s$/i,/pox$/i,/sheep$/i].forEach(d.addUncountableRule),d},e.exports=n()}}]);
//# sourceMappingURL=6381-15db8d717411d296.js.map