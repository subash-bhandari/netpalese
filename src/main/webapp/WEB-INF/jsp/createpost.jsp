<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="createpost-title">
	<table style="width: 100%" border="0">
		<tr>
			<td width="40px">
				<span style="font-weight: bold;">Title</span>
			</td>
			<td style="padding-right: 5px;">
				<input type="text" style="width: 100%" />
			</td>
		</tr>
	</table>
	 
</div>

<div class="wmd-panel">
    <div id="wmd-button-bar-second"></div>
	    <textarea class="wmd-input" id="wmd-input-second">
This is the *second* editor.
------------------------------

It has a plugin hook registered that surrounds all words starting with the
letter A with asterisks before doing the Markdown conversion. Another one gives bare links
a nicer link text. User input isn't sanitized here:

<marquee>I'm the ghost from the past!</marquee>

http://google.com

http://stackoverflow.com

It also includes a help button.

Finally, note that when you press Ctrl-Q or click the "Blockquote" button (without having a
selection), this editor creates an example text that's different from the first editor.
		</textarea>
    </div>
    <div class="createpost-categories">
		<table style="width: 100%" border="0">
			<tr>
				<td width="80px"  style="padding-right: 5px;">
					<span style="font-weight: bold;">Categories</span>
				</td>
				<td>
					<input type="text" style="width: 100%" /> 
				</td>
			</tr>
		</table>
    </div>
    <div id="wmd-preview-second" class="wmd-panel wmd-preview">
</div>


<script type="text/javascript">
    (function () {
        var converter2 = new Markdown.Converter();

        converter2.hooks.chain("preConversion", function (text) {
            return text.replace(/\b(a\w*)/gi, "*$1*");
        });

        converter2.hooks.chain("plainLinkText", function (url) {
            return "This is a link to " + url.replace(/^https?:\/\//, "");
        });
        
        var help = function () { alert("Do you need help?"); }
        var options = {
            helpButton: { handler: help },
            strings: { quoteexample: "whatever you're quoting, put it right here" }
        };
        var editor2 = new Markdown.Editor(converter2, "-second", options);
        
        editor2.run();
    })();
</script>

