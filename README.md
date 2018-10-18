# Musical Structure App

Project #4 for Android Basics by Google Nanodegree Program

<h3>App Design</h3>
<table>
  <tr>
    <th>Criteria</th>
    <th>Meets Specifications</th>
  </tr>
  <tbody>
    <tr>
      <td>
        <p>Suitability</p>
      </td>
      <td>
        <p>The app’s structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Clarity</p>
      </td>
      <td>
        <p>The purpose of each activity is easy for a user to understand through the UI design and feature labeling.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Number of Activities</p>
      </td>
      <td>
        <p>The app contains 2 to 6 activities</p>
      </td>
    </tr>
  </tbody>
</table>

<h3>Layout</h3>
<table>
  <tr>
    <th>Criteria</th>
    <th>Meets Specifications</th>
  </tr>
  <tbody>
    <tr>
      <td>
        <p>Structure</p>
      </td>
      <td>
        <p>The app contains multiple activities, each labelled, which together make a cohesive music app.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Labelling</p>
      </td>
      <td>
        <p>Features in the app are clearly defined either by labelling or images. For example, a button to play music could use a universally recognized triangular "Play" symbol or could have the text label "Play".</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Buttons</p>
      </td>
      <td>
        <p>Each activity contains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a ‘Library’ activity might contain a button to move to the ‘Now Playing’ activity.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Layout Best Practices</p>
      </td>
      <td>
        <p>The code adheres to all of the following best practices:</p>
        <ul>
          <li>Text sizes are defined in sp</li>
          <li>Lengths are defined in dp</li>
          <li>Padding and margin is used appropriately, such that the views are not crammed up against each other.</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>

<h3>Functionality</h3>
<table>
  <tr>
    <th>Criteria</th>
    <th>Meets Specifications</th>
  </tr>
  <tbody>
    <tr>
      <td>
        <p>Runtime Errors</p>
      </td>
      <td>
        <p>The code runs without errors</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>OnClickListeners</p>
      </td>
      <td>
        <p>Each button’s behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Intents</p>
      </td>
      <td>
        <p>Each button properly opens the intended activity using an explicit Intent.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Custom Adapter</p>
      </td>
      <td>
        <p>App uses a custom adapter to populate the layout with views based on instances of the custom class.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Data Storage and Retrieval</p>
      </td>
      <td>
        <p>Information about instances of the custom class are stored in an appropriate data structure (e.g. ArrayList, Array).</p>
        <p>When the information needs to be displayed, it is efficiently retrieved (e.g. Looping).</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Custom Class</p>
      </td>
      <td>
        <p>Data about each song (or equivalent audio media such as podcast episode) should be stored in a custom class that contains at least 2 states (e.g. Song Name, Artist Name)</p>
        <p>If images are included (e.g. Album Art), they are stored as drawables. All drawables are stored at multiple densities. Images are not required.</p>
      </td>
    </tr>
  </tbody>
</table>

<h3>Code Quality</h3>
<table>
  <tr>
    <th>Criteria</th>
    <th>Meets Specifications</th>
  </tr>
  <tbody>
    <tr>
      <td>
        <p>Code Formatting</p>
      </td>
      <td>
        <p>The code is properly formatted:</p>
        <ul>
          <li>No unnecessary blank lines</li>
          <li>No unused variables or methods</li>
          <li>No commented out code</li>
        </ul>
        <p>The code also has proper indentation when defining variables and methods.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Readability</p>
      </td>
      <td>
        <p>Code is easily readable so that a fellow programmer can understand the purpose of the app.</p>
      </td>
    </tr>
    <tr>
      <td>
        <p>Naming Conventions</p>
      </td>
      <td>
        <p>All variables, methods, and resource IDs are descriptively named so that another developer reading the code can easily understand their function.</p>
      </td>
    </tr>
  </tbody>
</table>

<em>Requirements copied from: <a href="http://udacity.com">udacity.com</a>.</em>

<br />
<p align="center"> 
  <img src="showcase/musical_structure_app_1.jpg" alt="Project Image 1">
  <img src="showcase/musical_structure_app_2.jpg" alt="Project Image 2">
</p>
